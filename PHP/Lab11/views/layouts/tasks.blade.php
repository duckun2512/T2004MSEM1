<?php
?>
{{--Thua ke tu app.blade--}}
@extends('layouts.app');

{{--Noi dung trang con--}}
@section('content')

    {{--Dinh nghia noi dung cua trang Task--}}
    <div class="panel-body">
        {{--Hien thi thong bao loi 503--}}
        @include('errors.503')

        {{--form nhap Task moi--}}
        <form action="{{url('task')}}" method="post" class="form-horizontal">
            {{carf_field()}}

            {{--Ten cua Task--}}
            <div class="form-group">
                <label for="task" class="col-sm-3 control-label">Task</label>
                <div class="col-sm-6">
                    <input type="text" name="name" id="task-name" class="form-control">
                </div>
            </div>

            {{--Button cua Task--}}
            <div class="form-group">
                <div class="col-sm-offset-3 col-sm-6">
                    <button type="submit" class="btn btn-default">
                        <i class="fa fa-plus"></i>Add Task
                    </button>
                </div>
            </div>
        </form>

        {{--Hien thi Task hien tai co trong database--}}
        @if(count($tasks) > 0)
            <div class="panel panel-default">
                <div class="panel-heading">
                    Current Task
                </div>
                <div class="panel-body">
                    <table class="table table-striped task-table">
                        {{--Tao tieu de cho cac cot--}}
                        <thead>
                            <td>Task</td>
                            <td>&nbsp;</td>
                        </thead>
                        {{--Tao cac dong hien thi noi dung--}}
                        <tbody>
                            @foreach($tasks as $task)
                                <tr>
                                    {{--Hien thi ten Task--}}
                                    <td class="table-text">
                                        <div>{{$task->name}}</div>
                                    </td>
                                    {{--Them Delete Button--}}
                                    <td>
                                        <form action="/task/{{task->id}}" method="post">
                                            {{carf_field()}}
                                            {{method_field('DELETE')}}
                                            <button>Delete Task</button>
                                        </form>
                                    </td>
                                </tr>
                            @endforeach
                        </tbody>
                    </table>
                </div>
            </div>
        @endif
    </div>

@endsection
