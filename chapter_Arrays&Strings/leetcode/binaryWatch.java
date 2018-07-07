        List<String> times = new ArrayList<>();
        for(int h=0; h<12; h++)
            for(int m=0; m<60; m++)
                if((bitCount(h)+bitCount(m))==num)
                    times.add(String.format("%d:%02d", h, m));
        return times;
    }
    public int bitCount(int input){
        if(input == 0) return 0;
        int count=0, remainder=0;
        while(input>0){
            remainder = input % 2;
            input /= 2;
            if(remainder==1) count++;
        }
        return count;
