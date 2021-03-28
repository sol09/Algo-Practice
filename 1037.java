// 1037. 

class Solution {
    public boolean isBoomerang(int[][] points) {
        // 세 점이 한 직선 위에 존재하는지를 return
        // Hint1. 면적이 0이 아니면 true, 방정식으로는 풀 수 없을지?
        
        double[] distance = new double[3];
        for(int i=0; i<points.length; i++) {
            distance[i] = Math.sqrt(Math.pow(points[i][0]-points[(i+1)%3][0],2)
                                    +Math.pow(points[i][1]-points[(i+1)%3][1],2));
        }
        
        double s = 1/2*(distance[0]+distance[1]+distance[2]);
        double Scale = s*(s-distance[0])*(s-distance[1])*(s-distance[2]);
        
        if(Scale!=0)
            return true;
        else
            return false;
    }
}

/* 미완성. 내일 마저 풀 것. -210327- */


// 210328

class Solution {
    public boolean isBoomerang(int[][] points) {
        // 세 점이 한 직선 위에 존재하는지를 return
        // Hint1. 면적이 0이 아니면 true, 방정식으로는 풀 수 없을지?
        
        double a = Math.sqrt(Math.pow(points[0][0]-points[1][0],2)
                             + Math.pow(points[0][1]-points[1][1]),2);
        double b = Math.sqrt(Math.pow(points[1][0]-points[2][0],2)
                             + Math.pow(points[1][1]-points[2][1]),2);
        double c = Math.sqrt(Math.pow(points[2][0]-points[0][0],2)
                             + Math.pow(points[2][1]-points[0][1]),2);
        
        double s = (a+b+c)/2;
        double Scale = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        if(Scale!=0)
            return true;
        else
            return false;
    }
}
