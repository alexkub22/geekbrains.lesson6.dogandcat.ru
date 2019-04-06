public abstract class Animals {
    String kingofanimal;
    String name;

    int runDist;
    int jumpHeight;
    int SwimDist;

    public void run (int dist){
        if(dist<= runDist){
            System.out.println(kingofanimal+""+name +"пробежала"+dist);
        }else {
            System.out.println(kingofanimal+""+name +"столько не бегает"+dist);
        }
    }
    public void jump (int height){
        if(height<= jumpHeight){
            System.out.println(kingofanimal+""+name +"перепрыгнула"+height);
        }else {
            System.out.println(kingofanimal+""+name +"столько не бегает"+height);
        }
    }
    public void swim (int dist){
        if(SwimDist==0){
            System.out.println(kingofanimal+"не плавает");
            return;
        }
        if(dist<= SwimDist){
            System.out.println(kingofanimal+""+name +"проплыла"+dist);
        }else {
            System.out.println(kingofanimal+""+name +"не может столько проплыть"+dist);
        }

    }
    public Animals(String kingofanimal, String name, int runDist, int jumpHeight, int swimDist) {
        this.kingofanimal = kingofanimal;
        this.name = name;
        this.runDist = runDist;
        this.jumpHeight = jumpHeight;
        SwimDist = swimDist;
    }

}
