class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        // 색이 같으면 굳이 바꿀 필요 없음 (무한루프 방지)
        if (originalColor == color) return image;

        dfs(image, sr, sc, originalColor, color);
        return image;
    }

    // 재귀함수: 현재 위치에서 연결된 같은 색을 찾아 바꿔나감
    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
        // 범위 밖이면 return
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) return;

        // 색이 다르면 return
        if (image[r][c] != originalColor) return;

        // 색 변경
        image[r][c] = newColor;

        // 4방향(상, 하, 좌, 우)으로 재귀적으로 퍼짐
        dfs(image, r + 1, c, originalColor, newColor); // 아래
        dfs(image, r - 1, c, originalColor, newColor); // 위
        dfs(image, r, c + 1, originalColor, newColor); // 오른쪽
        dfs(image, r, c - 1, originalColor, newColor); // 왼쪽
    }
}
