const doorImg1 = document.getElementById('door1');
const doorImg2 = document.getElementById('door2');
const doorImg3 = document.getElementById('door3');

const startButton = document.getElementById("start");

var opendoor1;
var opendoor2;
var opendoor3;
var currentPlaying = true;

var ClosedDoors = 3;

const botPath = "images/robot.svg";
const beachPath = "images/beach.svg";
const spacePath = "images/space.svg";
const closedPath = "images/closed_door.svg";

const startRound = function () {
    doorImg1.src = closedPath;
    doorImg2.src = closedPath;
    doorImg3.src = closedPath;
    ClosedDoors = 3;
    startButton.innerHTML = "Good luck!";
    currentPlaying = true;
    randomGenerator();
}

const randomGenerator = function()  {
    const choreDoor = Math.floor(Math.random() * ClosedDoors);

    if ( choreDoor === 0 ) {
        opendoor1 = botPath;
        opendoor2 = beachPath;
        opendoor3 = spacePath;
    } else if ( choreDoor === 1) {
         opendoor2 = botPath;
         opendoor1 = beachPath;
         opendoor3 = spacePath;
    } else {
        opendoor3 = botPath;
        opendoor2 = beachPath;
        opendoor1 = spacePath;
    }
}

doorImg1.onclick = function() {
    if (currentPlaying && isClicked(doorImg1)) {
        doorImg1.src = opendoor1;
        playDoor(doorImg1);
    }
}

doorImg2.onclick = function () {
    if (currentPlaying && isClicked(doorImg2)) {
        doorImg2.src = opendoor2;
        playDoor(doorImg2);
    }
}

doorImg3.onclick = function () {
    if (currentPlaying && isClicked(doorImg3)) {
        doorImg3.src = opendoor3;
        playDoor(doorImg3);
    }
}

startButton.onclick = function() {
    if (!currentPlaying) {
        startRound();
    }
}

const playDoor = function(door) {
    ClosedDoors--;
    if (ClosedDoors === 0) {
        gameover("win");
    } else if (isBot(door) === true) {
     return gameover();
    }
}

const gameover = function(status) {
    if (status === "win") {
        startButton.innerHTML = "You win! Play again?";
    } else {
        startButton.innerHTML = "Game over! Play again?";
    }
    currentPlaying = false;
}

const isBot = function(door) {
    if (door.src === botPath) {
        return true;
    } else {
        return false;
    }
}

const isClicked = function(door) {
    if (door.src === closedPath) {
        return false;
    } else {
        return true;
    }
}

var wontimes = 0;
var losstime = 0;

function getResult() {
}

startRound();