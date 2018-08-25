package com.samyn.joseph.interactivestory.model;

import com.samyn.joseph.interactivestory.R;

public class Story {
    private Page[] page;

    public Story() {
        page = new Page[7];

        page[0] = new Page(R.drawable.page0, R.string.page0, new Choice(R.string.page0_choice1, 1),
                new Choice(R.string.page0_choice2, 2));

        page[1] = new Page(R.drawable.page1,
                R.string.page1,
                new Choice(R.string.page1_choice1, 3),
                new Choice(R.string.page1_choice2, 4));

        page[2] = new Page(R.drawable.page2,
                R.string.page2,
                new Choice(R.string.page2_choice1, 4),
                new Choice(R.string.page2_choice2, 6));

        page[3] = new Page(R.drawable.page3,
                R.string.page3,
                new Choice(R.string.page3_choice1, 4),
                new Choice(R.string.page3_choice2, 5));

        page[4] = new Page(R.drawable.page4,
                R.string.page4,
                new Choice(R.string.page4_choice1, 5),
                new Choice(R.string.page4_choice2, 6));

        page[5] = new Page(R.drawable.page5, R.string.page5);

        page[6] = new Page(R.drawable.page6, R.string.page6);

    }

    public Page getPage(int pageNumber) {
        if(pageNumber > page.length){
            pageNumber = 0;
        }
        return page[pageNumber];
    }
}
