import com.badlogic.gdx.scenes.scene2d.Stage;

public class Plane extends BaseActor{


    public Plane(float x, float y, Stage s){
        super(x,y,s);
        String[] filenames = {
                "planeGreen0.png", "planeGreen1.png", "planeGreen2.png", "planeGreen1.png"
        };

        loadAnimationFromFiles(filenames, 0.1f, true);

        setMaxSpeed(800);
        setBoundaryPolygon(8);
    }

     public void act(float dt){

        super.act(dt);

        setAcceleration(800);
        accelerateAtAngle(270);
        applyPhysics(dt);

        for(BaseActor g : BaseActor.getList(this.getStage(), "Ground")){
            if(this.overlaps(g)){
                setSpeed(0);
                preventOverlap(g);
            }

            if(getY() + getHeight() > getWorldBounds().height){
                setSpeed(0);
                boundToWorld();
            }
        }
     }

     public void boost(){
        setSpeed(300);
        setMotionAngle(90);
     }
}
