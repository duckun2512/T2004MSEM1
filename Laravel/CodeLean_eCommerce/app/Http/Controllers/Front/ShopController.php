<?php

namespace App\Http\Controllers\Front;

use App\Http\Controllers\Controller;
use App\Models\Product;
use App\Models\ProductComment;
use Faker\Provider\Base;
use Illuminate\Http\Request;

class ShopController extends BaseController
{
    //
    public function show($id) {
        $product = Product::findOrFail($id);

        $avgRating = 0;
        $sumRating = array_sum(arrray_column($product->productComments->toArray(), 'rating'));
        $countRating = count($product->productComments);
        if($countRating != 0) {
            $avgRating = $sumRating / $countRating;
        }

        $relatedProduct = Product::where('product_category_id', $product->product_category_id)
            ->where('tag', $product->tag)
            ->limit(4)
            ->get();

        return view('front.shop.show', compact('product', 'avgRating', 'relatedProduct'));
    }

    public function postComment(Request $request) {
        ProductComment::create($request->all());

        return redirect()->back();
    }

    public function index() {
        $products = Product::paginate(6);

        return view('front.shop.index', compact('products'));
    }
}
