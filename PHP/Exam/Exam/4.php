<?php
?>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Add New Student</title>
    </head>
    <body>
    <form action="insert.php" method="post">
        <p>
            <label for="Name">Name:</label>
            <input type="text" name="name" id="Name">
        </p>
        <p>
            <label for="age">Age:</label>
            <input type="text" name="age" id="age">
        </p>
        <p>
            <label for="Address">Address</label>
            <input type="text" name="address" id="Address">
        </p>
        <p>
            <label for="telephone">Telephone</label>
            <input type="text" name="telephone" id="telephone">
        </p>
        <button type="submit">Submit</button>
    </form>
    </body>
</html>
