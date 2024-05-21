public class Physics {
    float calculateVelocity(float distance, int time){
        return distance/time;
    }
    float calculateVelocity(float initialVelocity, int acceleration, int time){
        return initialVelocity + (acceleration * time);
    }
}