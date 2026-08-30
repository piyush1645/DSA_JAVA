class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph =new ArrayList[numCourses];

        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }

        int[] indegree=new int[numCourses];

        //create graph
        for(int i=0;i<prerequisites.length;i++){

            int course =prerequisites[i][0];
            int pre=prerequisites[i][1];

            graph[pre].add(course);
            indegree[course]++;
        }

        Queue<Integer> q=new LinkedList<>();

        //course having no pre
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int[] ans=new int[numCourses];
        int k=0;

        while(!q.isEmpty()){
            int curr=q.remove();
            ans[k]=curr;
            k++;
            for(int i=0;i<graph[curr].size();i++){
                indegree[graph[curr].get(i)]--;
                if(indegree[graph[curr].get(i)]==0){
                    q.add(graph[curr].get(i));
                }
            }
        }
        //cycle
        if(k !=numCourses){
            return new int[0];
        }
        return ans;
    }
}