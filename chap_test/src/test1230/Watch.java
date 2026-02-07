package test1230;

public class Watch {
	int hour,minute,second;
	void see(){
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
	}
	
	void addHour(int hour) {
		this.hour += hour;
		if(this.hour>24) {
			this.hour%=24;
		}
		System.out.println(hour+"시간 후("+hour/24+"시간)");
	}
	
	void addMinute(int minute) {
		this.minute+=minute;
		if(this.minute>60) {
			this.hour++;
			this.minute%=60;
		}
		System.out.println(minute+"분 후  ("+minute/60+"시간 "+ minute%60 + "분)");
	}
	
	void addSecond(int second) {
		this.second+=second;
		if(this.second>3600) {
			hour++;
			this.second%=3600;
			if(this.second>60) {
				minute++;
				this.second%=60;
			}
		}else if(this.second>60) {
			minute++;
			this.second%=60;
		}
		System.out.println(second+"초 후("+second/3600+"시간 "+(second%3600)/60+"분 "+(second%3600)%60+"초)");
	}
}
