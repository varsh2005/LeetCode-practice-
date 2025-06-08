class Solution {
    public int[] intersection(int[] a, int[] b) {
        int[] res = new int[1000];
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    boolean dup = false;
                    for (int k = 0; k < n; k++) {
                        if (res[k] == a[i]) dup = true;
                    }
                    if (!dup) res[n++] = a[i];
                    break;
                }
            }
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) ans[i] = res[i];
        return ans;
    }
}
