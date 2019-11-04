// problem link
// https://leetcode.com/problems/keys-and-rooms/

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // total number of rooms
        int num_rooms = rooms.size();
        int[] visited = new int[num_rooms]; // if a room is visited, the corresponding value is set to be one
        dfs(rooms,0, visited);
        int ssum = 0;
        for(int i: visited) ssum += i;
        return ssum == num_rooms? true : false;
    }
    private void dfs(List<List<Integer>> rooms, int n, int[] visited){
        if(visited[n] == 1) return;
        visited[n] = 1;
        for(int next : rooms.get(n)){
            dfs(rooms, next, visited);
        }
    }
}