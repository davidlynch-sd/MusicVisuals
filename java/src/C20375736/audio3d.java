package C20375736;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class audio3d extends PApplet
{
    Minim minim;
    AudioPlayer ap;
    AudioInput ai;
    AudioBuffer ab;



    float[] lerpedBuffer;
    float y = 0;
    float smoothedY = 0;
    float smoothedAmplitude = 0;

    
    public void settings()
    {
        size(1024, 500, P3D);
        //fullScreen(P3D, SPAN);
        
    }

    public void setup()
    {
        minim = new Minim(this);

        ap = minim.loadFile("ambiTestTrack.mp3", 1024);
        ap.play();
        ab = ap.mix;
        colorMode(RGB);

        y = height / 2;
        smoothedY = y;

        lerpedBuffer = new float[width];
    }

	float rot = 0;

    Tree tree1;
    public void draw()
    {

        // //float halfH = height / 2;
        // float average = 0;
        // float sum = 0;
        

        // // Calculate sum and average of the samples
        // // Also lerp each element of buffer;
        // for(int i = 0 ; i < ab.size() ; i ++)
        // {
        //     sum += abs(ab.get(i));
        //     lerpedBuffer[i] = lerp(lerpedBuffer[i], ab.get(i), 0.05f);
        // }
        // average= sum / (float) ab.size();

        // smoothedAmplitude = lerp(smoothedAmplitude, average, 0.1f);
        

        // System.out.println(smoothedAmplitude);
        
		//rot += smoothedAmplitude;

        // background(28, 221, 255);

        // translate(width/4, height/2); 
        

        // tree1 = new Tree(100, this);

        // tree1.drawTree();



        //pushMatrix();


        // fill(41, 230, 60);  //tree colour
        // //noStroke();
        // sphere(100);


        // fill(51, 5, 5);  //trunk colour
        // translate(0, height/4); 
        // box(50, height/2, 50);

        // popMatrix();

        // fill(242, 22, 22);
        // box(500,1,500);

		// rotateX(rot);
		// rotateY(rot);
        // box(map(smoothedAmplitude, 0, 0.1f, 0, 100));  //w, h, d
        
        
        

    }        
}
