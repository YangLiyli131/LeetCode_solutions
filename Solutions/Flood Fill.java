// problem link
// https://leetcode.com/problems/flood-fill/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int startingcolor = image[sr][sc];
        dfs(image, sr, sc, newColor, startingcolor);
        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int newColor, int startingcolor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) return;
        if(image[sr][sc] == newColor) return;
        if(image[sr][sc] != startingcolor) return;
        image[sr][sc] = newColor;
        dfs(image, sr-1, sc, newColor, startingcolor);
        dfs(image, sr+1, sc, newColor, startingcolor);
        dfs(image, sr, sc-1, newColor, startingcolor);
        dfs(image, sr, sc+1, newColor, startingcolor);
    }
}