class Process {
    int processID, burstTime, priority;
    Process next;

    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    Process head, tail;
    int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    public void removeProcess(int processID) {
        if (head == null) return;
        Process temp = head, prev = null;
        do {
            if (temp.processID == processID) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void executeProcesses() {
        if (head == null) return;
        Process temp = head;
        int totalWaitingTime = 0, totalTurnaroundTime = 0, completedProcesses = 0;
        do {
            if (temp.burstTime > 0) {
                int execTime = Math.min(timeQuantum, temp.burstTime);
                temp.burstTime -= execTime;
                if (temp.burstTime == 0) {
                    totalTurnaroundTime += totalWaitingTime + execTime;
                    completedProcesses++;
                    removeProcess(temp.processID);
                } else {
                    totalWaitingTime += execTime;
                }
            }
            temp = temp.next;
        } while (head != null);
        System.out.println("Average Waiting Time: " + (double) totalWaitingTime / completedProcesses);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / completedProcesses);
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4);
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.executeProcesses();
    }
}
