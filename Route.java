public class Route implements Comparable<Route> {
    private String source;
    private String destination;

    public Route (String s,String d){
        source = s;
        destination = d;
    }

    public int compareTo(Route that) {
        if(this.source == that.source && this.destination == that.destination ){
            return 1;
        }else{return 0;}
    }
    




}