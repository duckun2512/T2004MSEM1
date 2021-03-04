<?php

use Illuminate\Support\Facades\Route;
use App\Models\Post;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('home','HomeController@showWelcome');
Route::get('about','AboutController@showDetails');

Route::get('/', function () {
    return view('welcome');
});

Route::get('profile/{name}','ProfileController@showProfile');

//Route::get('about',function () {
//    return 'About Content';
//});

Route::get('about/directions',array('as' => 'directions', function() {
    $theURL = URL::route('directions');
    return "Directions go to this URL: $theURL";
}));

Route::get('about/directions',function () {
    return 'Directions go here';
});

Route::any('submit-form',function () {
    return 'Process Form';
});

//Route::get('about/{theSubject}',function ($theSubject) {
//   return $theSubject. ' content goes here';
//});

Route::get('about/{theSubject}', 'AboutController@showSubject');

Route::get('about/classes/{Price}/{Art}', function ($Art, $Price) {
   return "Price: $Price, Art: $Art";
});

Route::get('where', function () {
    return Redirect::route('directions');
});

Route::get('/insert',function () {
   DB::insert('insert into posts(title,body,is_admin) values(?,?,?)',['PHP with Laravel','Laravel is the best framework!']);
   return 'DONE!';
});

Route::get('/read',function () {
   $result = DB::select('select * from posts when id=?',[1]);
   //return $result;
    foreach ($result as $post) {
        return $post->title;
    }
});

Route::get('update',function () {
    $updated = DB::update('update posts set title = "New Title" where id > ?',[1]);
    return $updated;
});

Route::get('delete', function () {
    $deleted = DB::delete('delete from posts where id = ?',[3]);
    return $deleted;
});

Route::get('readAll',function () {
    $posts = Post::all();
    foreach ($posts as $p) {
        //return $p->title;
        echo $p->title . " " . $p->body;
        echo "<br>";
    }
});

Route::get('findId', function () {
    $posts = Post::where('id', '>=', 1)
        ->where('title', 'PHP with Laravel')
        ->where('body', 'like', '%new%')
        ->orderBy('id', 'desc')
        ->take(10)
        ->get();
    foreach ($posts as $p) {
        //return $p->title;
        echo $p->title . " " . $p->body;
        echo "<br>";
    }
});

Route::get('insertORM', function () {
    $p = new Post;
    $p->title = 'insert ORM';
    $p->body = 'INSERTED done ORM';
    $p->is_admin = 1;
    $p->save();
});

Route::get('updateORM', function () {
    $p = Post::where('id', 4)->first();
    $p->title = 'updated ORM';
    $p->body = 'updated done';
    $p->save();
});

Route::get('deleteORM', function () {
    Post::where('id', '>=', 14)
        ->delete();
});

Route::get('destroyORM', function () {
    Post::destroy([7,11]);
});
