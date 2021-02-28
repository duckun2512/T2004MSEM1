<?php


namespace App\Http\Controllers;


use Illuminate\View\View;

class HomeController extends BaseController
{
    public function showWelcome(){
//      return 'Home Controller';
//      return view('hello');
        return view('index');
    }
}
