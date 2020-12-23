package test;

import java.util.*;
import java.io.*;



public class Main {
	
	static class Point {
		double x;
		double y;

		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	static class Segment {
		Point s;
		Point t;

		Segment(Point s, Point t) {
			this.s = s;
			this.t = t;
		}
	}

	static boolean in(double a, double b, double c) {
		return c >= a && c <= b;
	}

	static boolean onLine(Segment a, Point c) {
		double minx, maxx, miny, maxy;
		minx = Math.min(a.s.x, a.t.x);
		maxx = Math.max(a.s.x, a.t.x);
		miny = Math.min(a.s.y, a.t.y);
		maxy = Math.max(a.s.y, a.t.y);
		if (in(minx, maxx, c.x) && in(miny, maxy, c.y)) {
			if ((a.s.x - a.t.x) * (c.y - a.s.y) == (a.s.y - a.t.y) * (c.x - a.s.x)) {
				return true;
			}
		}
		return false;
	}

	static double cross(Point o, Point a, Point b) {
		return (a.x - o.x) * (b.y - o.y) - (a.y - o.y) * (b.x - o.x);
	}

	static boolean intersection(Segment a, Segment b) {
		if (onLine(a, b.s) || onLine(a, b.t) || onLine(b, a.s) || onLine(b, a.t))
			return true;
		if (cross(a.s, a.t, b.s) * cross(a.s, a.t, b.t) < 0 && cross(a.t, a.s, b.s) * cross(a.t, a.s, b.t) < 0
				&& cross(b.s, b.t, a.s) * cross(b.s, b.t, a.t) < 0 && cross(b.t, b.s, a.s) * cross(b.t, b.s, a.t) < 0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		 int i, j;
		 Scanner scan = new Scanner(System.in);
		 Segment line[] = new Segment[1000];
		    int times = scan.nextInt();
		    while(times-- !=0) {
		        int n = scan.nextInt();
		        for(i = 0; i < n; i++) {
		        	Point s = new Point(scan.nextDouble(),scan.nextDouble());
		        	Point t = new Point(scan.nextDouble(),scan.nextDouble());
		        	line[i] = new Segment(s,t);
		        }
		        int ans = 0;
		        for(i = 0; i < n; i++) {
		            int flag = 0;
		            for(j = 0; j < n; j++) {
		                if(i == j)
		                    continue;
		                if(intersection(line[i], line[j])) {
		                    flag = 1;
		                    break;
		                }
		            }
		            if(flag == 0)
		                ans++;
		        }
		        System.out.println(ans);
		    }
	}

}