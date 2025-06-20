// ✅ 정답 풀이 (hashmap 방식)

int[] nums = {2, 7, 11, 15};
int target = 9;

Map<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < nums.length; i++) {
    int x = nums[i];
    int y = target - x;

    if (map.containsKey(y)) {
        // y가 이미 map에 있다면, 그 인덱스와 i를 리턴
        return new int[] {map.get(y), i};
    }

    map.put(x, i); // 현재 숫자와 인덱스를 저장
}

return 