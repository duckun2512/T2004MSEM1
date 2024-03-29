<!DOCTYPE html>
<html>
    <head>
        <title>Be right back...</title>

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:100" type="text/css">

        <style>
            html, body {
                height: 100%;
            }

            body {
                margin: 0;
                padding: 0;
                width: 100%;
                color: #b0bec5;
                display: table;
                font-weight: 100;
                font-family: 'Lato', sans-serif;
            }

            .container {
                text-align: center;
                display: table-cell;
                vertical-align: middle;
            }

            .content {
                text-align: center;
                display: inline-block;
            }

            .title {
                font-size: 72px;
                margin-bottom: 40px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="content">
                <div class="title">Be right back...</div>
                @if(count($errors) > 0)
                    {{--danh sach loi--}}
                    <div class="alert alert-danger">
                        <strong>Error!!</strong>
                        <br><br>
                        <ul>
                            @foreach($errors->all() as $errors)
                                <li>{{$errors}}</li>
                            @endforeach
                        </ul>
                    </div>
                @endif;
            </div>
        </div>
    </body>
</html>
