package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/task-scheduler/
 * 给你一个用字符数组 tasks 表示的 CPU 需要执行的任务列表。其中每个字母表示一种不同种类的任务。
 * 任务可以以任意顺序执行，并且每个任务都可以在 1 个单位时间内执行完。在任何一个单位时间，CPU 可以完成一个任务，或者处于待命状态。
 * 然而，两个 相同种类 的任务之间必须有长度为整数 n 的冷却时间，因此至少有连续 n 个单位时间内 CPU 在执行不同的任务，或者在待命状态。
 * 你需要计算完成所有任务所需要的 最短时间 。
 */
public class LeastInterval {
    static class TaskInfo {
        public char task;
        public int count;
        /**
         * 可用的时间
         */
        public int usableGeneration;
    }

    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        var list = new ArrayList<TaskInfo>();
        map.entrySet().forEach(entry ->
        {
            var task = new TaskInfo();
            task.count = entry.getValue();
            task.usableGeneration = 0;
            task.task = entry.getKey();
            list.add(task);
        });

        list.sort((a, b) -> b.count - a.count);

        int generation = 0;
        int costTime = 0;
        // 顺序遍历一遍，如果都不可用，补一个idle
        while (true) {
            for (var task : list) {
                if (task.usableGeneration > generation || task.count == 0) {
                    continue;
                }
                task.usableGeneration = generation + n + 1;
                task.count--;
                break;
            }

            costTime++;
            generation++;

            list.removeIf(task -> task.count == 0);
            // TODO 这里需要重新排序，性能不佳，使用堆排序？
            list.sort((a, b) -> b.count - a.count);
            if (list.size() == 0) {
                break;
            }
        }
        return costTime;
    }
}
