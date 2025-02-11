package org.example.linkedlist;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "宋江", "及時雨");
        HeroNode hero2 = new HeroNode(2, "盧俊義", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吳用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林沖", "豹子頭");
        HeroNode hero5 = new HeroNode(5, "Peter", "Peter1");

        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);
        singleLinkedList.add(hero5);

        singleLinkedList.list();
    }
}

//定義SingleLinkedList 管理英雄
class SingleLinkedList {
    //先初始化一個頭節點,頭節點不要動,不存放具體數據
    private HeroNode head = new HeroNode(0, "", "");

    //添加節點到單向鏈結串列
    //思路:當不考慮編號順序時
    //1.找到當前鏈結串列的最後節點
    //2.將最後節點的next域指向新的節點
    public void add(HeroNode heroNode) {

        //因為head節點不能動,因此我們需要一個輔助遍歷 temp
        HeroNode temp = head;

        //遍歷鏈結串列,找到最後
        while (true) {
            if (temp.next == null) {
                break;
            }

            temp = temp.next; //沒找到就將temp後移一個節點
        }

        //當退出while循環時,temp就指向了鏈結串列的最後
        //將最後這個節點的next指向新的節點
        temp.next = heroNode;

    }

    //顯示鏈結串列
    public void list() {
        if (head.next == null) {
            System.out.println("鏈結串列為空");
            return;
        }

        HeroNode temp = head.next;

        while (true) {
            if (temp == null) {
                break;
            }
            //輸出節點訊息
            System.out.println(temp);
            //將temp後移, 不然是死循環
            temp = temp.next;
        }
    }

}

//定義HeroNode, 每個HeroNode 對象就是一個節點
class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next; //指向下一個節點

    //構造函數
    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    //重寫toString
    @Override
    public String toString() {
        return "HeroNode [no = " + no + ", name = " + name + ", nickname = " + nickname + "]";
    }

}