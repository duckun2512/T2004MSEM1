<?php


namespace App\Http\Controllers;
use Illuminate\Routing\Controller as BaseController;
use Faker\Provider\Base;

class AboutController extends BaseController
{
    public function showDetails() {
        return 'About Details Information';
    }

    public function showSubject($theSubject) {
        return "Details information about $theSubject";
    }
}
