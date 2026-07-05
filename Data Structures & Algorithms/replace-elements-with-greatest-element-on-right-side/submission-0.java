class Solution {
    public int[] replaceElements(int[] arr) {
        int[] greEleArr = new int[arr.length];
        int maxFrmRight = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                greEleArr[i] = -1;
            } else {
                greEleArr[i] = maxFrmRight;
            }
            maxFrmRight = Math.max(maxFrmRight, arr[i]);
        }
        return greEleArr;
    }
}