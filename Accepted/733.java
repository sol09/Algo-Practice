// 733. Flood Fill

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];    // 기존 Color
        
        if(color!=newColor)
            dfs(image,sr,sc,color,newColor);
        
        return image;
    }
    
    public void dfs(int[][] image, int r, int c, int oC, int nC) {
        if(image[r][c] == oC) {
            image[r][c] = nC;
            if(r>=1) dfs(image, r-1, c, oC, nC);
            if(c>=1) dfs(image, r, c-1, oC, nC);
            if(r+1<image.length) dfs(image, r+1, c, oC, nC);
            if(c+1<image[r].length) dfs(image, r, c+1, oC, nC);
        }
    }
}

/* image에서 제시된 행(sr), 열(sc)의 숫자를 newColor로 바꾸고 동서남북 칸의 숫자가 해당 칸과 같은 숫자일 때 마찬가지로 newColor로 바꾸는 알고리즘.
 * 원래 Color가 newColor와 다를 때 dfs 를 호출해 변경한다.
 * dfs 함수에서 조건을 걸어서 image의 사이드 칸들을 변경할 때 범위를 벗어나지 않게 한다.
 */
