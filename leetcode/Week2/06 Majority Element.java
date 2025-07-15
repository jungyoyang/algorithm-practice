class Solution {
    public int majorityElement(int[] nums) {
                HashMap<Integer, Integer> countMap = new HashMap<>();
                int majorityCount = nums.length / 2;

                for (int num : nums) {
                    // 현재 숫자의 카운트를 1 증가시킴
                    countMap.put(num, countMap.getOrDefault(num, 0) + 1);

                    // 과반수 이상이면 바로 반환
                    if (countMap.get(num) > majorityCount) {
                        return num;
                    }
                }

                // 문제 조건상 항상 존재하므로 여기 도달하지 않음
                return -1;
            }
    }


    