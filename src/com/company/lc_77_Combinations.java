package com.company;

public class lc_77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> rslt = new ArrayList<List<Integer>>();
        dfs(new Stack<Integer>(), 1, n, k, rslt);
        return rslt;
    }

    private void dfs(Stack<Integer> path, int index, int n, int k, List<List<Integer>> rslt){
        // ending case
        if(k==0){
            List<Integer> list = new ArrayList<Integer>(path);
            rslt.add(list);
            return;
        }
        // recursion case
        for(int i = index;i <= n;i++){
            path.push(i);
            dfs(path, i+1, n, k-1, rslt);
            path.pop();
        }
    }
}
