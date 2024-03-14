/*
***24 animals needed***

variables:
 space-int
 owned-boolean
 cost-int
 stoplevel-int
 name-string
 owner-string
 stoplevel(costs[4])-int

methods:
 getstoplevel()-int
 getowned()-boolean
 purchase()-void
 */

/*

___________________



RENT AMOUNTS WILL NOT BE THE SAME WHEN CALLED FROM GetLevels(), this is a ROUGH GUIDE !!!!!

1 Penguin - 100

cost of upgrade: 100

level 1 rent = 12
level 2 rent = 25
level 3 rent = 125
level 4 rent = 375

Group 1
___________________


2 polar bear - 100

cost of upgrade: 100

level 1 rent = 12
level 2 rent = 25
level 3 rent = 125
level 4 rent = 375

Group 1
___________________


3 seal - 125

cost of upgrade: 125

level 1 rent = 10
level 2 rent = 32
level 3 rent = 160
level 4 rent = 380

Group 1
___________________


4 dog - 250

cost of upgrade: 300

level 1 rent = 23
level 2 rent = 62
level 3 rent = 310
level 4 rent = 930

Group 2
___________________


5 cat - 300

cost of upgrade: 400

level 1 rent = 28
level 2 rent = 75
level 3 rent = 375
level 4 rent = 1125

Group 2
___________________


6 clownfish - 150

cost of upgrade: 150

level 1 rent = 13
level 2 rent = 37.5
level 3 rent = 187.5
level 4 rent = 560

Group 3
___________________


7 catfish - 150

cost of upgrade: 150

level 1 rent = 13
level 2 rent = 37.5
level 3 rent = 187.5
level 4 rent = 560

group 3

___________________


8 dogfish - 150

cost of upgrade: 150

level 1 rent = 13
level 2 rent = 37.5
level 3 rent = 187.5
level 4 rent = 560

group 3

___________________


9 sheep - 75

cost of upgrade: 50

level 1 rent = 8
level 2 rent = 19
level 3 rent = 95
level 4 rent = 285

group 4

___________________


10 cow - 75

cost of upgrade: 50

level 1 rent = 8
level 2 rent = 19
level 3 rent = 95
level 4 rent = 285

group 4

___________________


11 rabbit - 125

cost of upgrade: 125

level 1 rent = 10
level 2 rent = 32
level 3 rent = 160
level 4 rent = 380

group 5

___________________


12 guinea pig - 125

cost of upgrade: 125

level 1 rent = 10
level 2 rent = 32
level 3 rent = 160
level 4 rent = 380

group 5

___________________


13 hamster - 125

cost of upgrade: 125

level 1 rent = 10
level 2 rent = 32
level 3 rent = 160
level 4 rent = 380

group 5

___________________



14 snake - 200

cost of upgrade: 250

level 1 rent = 18
level 2 rent = 50
level 3 rent = 250
level 4 rent = 750

group 6

___________________


15 gecko - 200

cost of upgrade: 250

level 1 rent = 18
level 2 rent = 50
level 3 rent = 250
level 4 rent = 750

group 6

___________________


16 bearded dragon - 200

cost of upgrade: 250

level 1 rent = 18
level 2 rent = 50
level 3 rent = 250
level 4 rent = 750

group 6

___________________



17 ant - 125

cost of upgrade: 125

level 1 rent = 10
level 2 rent = 32
level 3 rent = 160
level 4 rent = 380

group 7

___________________


18 woodlouse - 150

cost of upgrade: 150

level 1 rent = 13
level 2 rent = 37.5
level 3 rent = 187.5
level 4 rent = 560

group 7

___________________


19 millipede - 150

cost of upgrade: 150

level 1 rent = 13
level 2 rent = 37.5
level 3 rent = 187.5
level 4 rent = 560

group 7

___________________


20 deer - 150

cost of upgrade: 150

level 1 rent = 13
level 2 rent = 37.5
level 3 rent = 187.5
level 4 rent = 560

group 8

___________________


21 horse - 150

cost of upgrade: 150

level 1 rent = 13
level 2 rent = 37.5
level 3 rent = 187.5
level 4 rent = 560

group 8

___________________


22 bear - 175

cost of upgrade: 175

level 1 rent = 18
level 2 rent = 44
level 3 rent = 219
level 4 rent = 657

group 8

___________________


23 raccoon - 175

cost of upgrade: 175

level 1 rent = 18
level 2 rent = 44
level 3 rent = 219
level 4 rent = 657

group 9

___________________


24 badger - 175

cost of upgrade: 175

level 1 rent = 18
level 2 rent = 44
level 3 rent = 219
level 4 rent = 657

group 9

RENT AMOUNTS WILL NOT BE THE SAME WHEN CALLED FROM GetLevels(), this is a ROUGH GUIDE !!!!!


___________________



 */

public class Animals {
    // create attributes

    int space;
    boolean owned;
    int cost;
    int stoplevel;
    String name;
    int group;
    int upgcost;
    public Animals (int space1, int cost1,int group1,int upgcost1, String name1){
        space = space1;
        owned = false;
        cost = cost1;
        stoplevel = 0;
        group = group1;
        upgcost = upgcost1;
        name = name1;
    }
    public int[] GetLevels(){
        int l1,l2,l3,l4;
        int costlocal = cost;
        l1 = 2+costlocal/10;
        l2 = costlocal/4;
        l3 = l2*5;
        l4 = l3*3;
        int levels[] = {l1,l2,l3,l4};
        System.out.println(l1+" "+l2+" "+l3+" "+l4);
        return levels;
    }
}
