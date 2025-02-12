import java.util.Scanner;

class Item {
    String name;
    int id, quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    private Item head;

    void addItem(String name, int id, int quantity, double price, int position) {
        Item newItem = new Item(name, id, quantity, price);
        if (position == 0 || head == null) {
            newItem.next = head;
            head = newItem;
            return;
        }
        Item temp = head;
        for (int i = 0; temp.next != null && i < position - 1; i++) {
            temp = temp.next;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    void removeItem(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void updateQuantity(int id, int quantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = quantity;
                return;
            }
            temp = temp.next;
        }
    }

    Item searchByID(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    Item searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    double totalInventoryValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        return total;
    }

    void sortInventory(boolean sortByName, boolean ascending) {
        head = mergeSort(head, sortByName, ascending);
    }

    private Item mergeSort(Item head, boolean sortByName, boolean ascending) {
        if (head == null || head.next == null) return head;
        Item mid = getMiddle(head);
        Item nextToMid = mid.next;
        mid.next = null;
        Item left = mergeSort(head, sortByName, ascending);
        Item right = mergeSort(nextToMid, sortByName, ascending);
        return merge(left, right, sortByName, ascending);
    }

    private Item merge(Item left, Item right, boolean sortByName, boolean ascending) {
        if (left == null) return right;
        if (right == null) return left;
        boolean condition = sortByName ? left.name.compareTo(right.name) < 0 : left.price < right.price;
        if (!ascending) condition = !condition;
        if (condition) {
            left.next = merge(left.next, right, sortByName, ascending);
            return left;
        } else {
            right.next = merge(left, right.next, sortByName, ascending);
            return right;
        }
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void displayInventory() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.name + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Item\n2. Remove Item\n3. Update Quantity\n4. Search Item\n5. Display Inventory\n6. Total Value\n7. Sort Inventory\n8. Exit");
            int choice = sc.nextInt();
            if (choice == 8) break;
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Name, ID, Quantity, Price, Position:");
                    inventory.addItem(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
                }
                case 2 -> {
                    System.out.println("Enter ID to Remove:");
                    inventory.removeItem(sc.nextInt());
                }
                case 3 -> {
                    System.out.println("Enter ID and New Quantity:");
                    inventory.updateQuantity(sc.nextInt(), sc.nextInt());
                }
                case 4 -> {
                    System.out.println("Enter 1 for ID, 2 for Name:");
                    int type = sc.nextInt();
                    if (type == 1) System.out.println(inventory.searchByID(sc.nextInt()));
                    else System.out.println(inventory.searchByName(sc.next()));
                }
                case 5 -> inventory.displayInventory();
                case 6 -> System.out.println("Total Inventory Value: " + inventory.totalInventoryValue());
                case 7 -> {
                    System.out.println("Enter 1 for Name, 2 for Price, 1 for Ascending, 2 for Descending:");
                    inventory.sortInventory(sc.nextInt() == 1, sc.nextInt() == 1);
                }
            }
        }
        sc.close();
    }
}
