
void setup()
{
  size(1300,500);
}

noStroke();
var eyeSize = 20;
var x = 200;
var speed = 1;

draw = function() {
drawFace(eyeSize-30,200,speed-0.8);
drawFace1(eyeSize+10,150,speed-0.8888);
drawFace2(eyeSize+15,100,speed-0.9999);
};

drawFace = function(var sizePoint, var colorPoint, var speedPoint) {
        // face
        fill(255, 255, 0);
        ellipse(x, 208, 300+speedPoint, 300+speedPoint);

        // eyes
        fill(46, 46, 41);
        ellipse(x - 50, 151 - sizePoint, eyeSize + sizePoint, eyeSize + sizePoint);
        ellipse(x + 100, 142 - sizePoint, eyeSize + sizePoint, eyeSize + sizePoint);

        // mouth
        fill(colorPoint, 0, 255);
        ellipse(x + 50, 240, 120, 136);

        eyeSize += speedPoint;
}

drawFace1 = function(var sizePoint, var colorPoint, var speedPoint) {
    // face
    fill(255, 255, 0);
    ellipse(x + 350, 208, 300 + speedPoint, 300 + speedPoint);

    // eyes
    fill(46, 46, 41);
    ellipse(x - 50 + 350, 151 + sizePoint, eyeSize + sizePoint, eyeSize + sizePoint);
    ellipse(x + 100 + 350, 142 + sizePoint, eyeSize + sizePoint, eyeSize + sizePoint);

    // mouth
    fill(colorPoint, 0, 255);
    ellipse(x + 50 + 350, 240, 120, 136);

    eyeSize += speedPoint;
}

drawFace2 = function(var sizePoint, var colorPoint, var speedPoint) {
    // face
    fill(255, 255, 0);
    ellipse(x + 700, 208, 300 + speedPoint, 300 + speedPoint);

    // eyes
    fill(46, 46, 41);
    ellipse(x - 50 + 700, 151 + sizePoint, eyeSize + sizePoint, eyeSize + sizePoint);
    ellipse(x + 100 + 700, 142 + sizePoint, eyeSize + sizePoint, eyeSize + sizePoint);

    // mouth
    fill(0, colorPoint, 255);
    ellipse(x + 750, 240, 120, 136);

    eyeSize += speedPoint;
}