import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // removeConsecElem
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(3);
        Algorithm.removeConsecElem(a);
        System.out.println(a);
        
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(2);
        b.add(2);
        b.add(2);
        Algorithm.removeConsecElem(b);
        System.out.println(b);
        
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(1);
        Algorithm.removeConsecElem(c);
        System.out.println(c);

        System.out.println();
        
        // removeElem
        ArrayList<Integer> d = new ArrayList<Integer>();
        d.add(1);
        d.add(2);
        d.add(2);
        d.add(3);
        d.add(3);

        Algorithm.removeElem(d, 2);
        System.out.println(d);

        ArrayList<Integer> e = new ArrayList<Integer>();
        e.add(1);
        e.add(1);
        e.add(1);

        Algorithm.removeElem(e, 1);
        System.out.println(e);

        ArrayList<Integer> f = new ArrayList<Integer>();
        f.add(1);
        f.add(2);
        f.add(4);
        f.add(3);
        f.add(5);

        Algorithm.removeElem(f, 5);
        System.out.println(f);

        System.out.println();
        
        // addElemToSorted
        ArrayList<Integer> g = new ArrayList<Integer>();
        g.add(1);
        g.add(2);
        g.add(2);
        g.add(3);
        g.add(3);

        Algorithm.addElemToSorted(g, 4);
        System.out.println(g);
        
        ArrayList<Integer> h = new ArrayList<Integer>();
        h.add(1);
        h.add(2);
        h.add(4);

        Algorithm.addElemToSorted(h, 3);
        System.out.println(h);
        
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(1);

        Algorithm.addElemToSorted(i, 0);
        System.out.println(i);

        System.out.println();
        
        // isReverse
        ArrayList<Integer> j = new ArrayList<Integer>();
        j.add(1);
        j.add(2);
        j.add(3);
        ArrayList<Integer> k = new ArrayList<Integer>();
        k.add(3);
        k.add(2);
        k.add(1);
        System.out.println(Algorithm.isReverse(j, k));
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(2);
        l.add(4);
        ArrayList<Integer> m = new ArrayList<Integer>();
        m.add(3);
        m.add(2);
        System.out.println(Algorithm.isReverse(l, m));
        
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(3);
        n.add(3);
        ArrayList<Integer> o = new ArrayList<Integer>();
        o.add(3);
        o.add(1);
        System.out.println(Algorithm.isReverse(n, o));

        System.out.println();
        
        // getMax
        System.out.println(Algorithm.getMax(k));
        System.out.println(Algorithm.getMax(l));
        System.out.println(Algorithm.getMax(n));

        System.out.println();
        
        // getMin
        System.out.println(Algorithm.getMin(k));
        System.out.println(Algorithm.getMin(l));
        System.out.println(Algorithm.getMin(n));

        System.out.println();
        
        // getShortestString
        ArrayList<String> p = new ArrayList<String>();
        p.add("Hello,");
        p.add("world");
        p.add("!");
        System.out.println(Algorithm.getShortestString(p));

        ArrayList<String> q = new ArrayList<String>();
        q.add("short");
        q.add("longer");
        q.add("longest");
        System.out.println(Algorithm.getShortestString(q));

        ArrayList<String> r = new ArrayList<String>();
        r.add("");
        r.add("a");
        r.add("ab");
        System.out.println(Algorithm.getShortestString(r));

        System.out.println();
        
        // getLongestString
        System.out.println(Algorithm.getLongestString(p));
        System.out.println(Algorithm.getLongestString(q));
        System.out.println(Algorithm.getLongestString(r));

        System.out.println();
        
        // getLargestDif
        ArrayList<Integer> s = new ArrayList<Integer>();
        s.add(2);
        s.add(3);
        s.add(4);
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(-1);
        t.add(-2);
        t.add(-3);
        System.out.println(Algorithm.getLargestDif(s, t));

        System.out.println(Algorithm.getLargestDif(s, s));
        
        ArrayList<Integer> u = new ArrayList<Integer>();
        u.add(2);
        u.add(0);
        System.out.println(Algorithm.getLargestDif(s, u));

        System.out.println();
        
        // getMean
        ArrayList<Double> v = new ArrayList<Double>();
        v.add(1.5);
        v.add(3.5);
        v.add(5.5);
        System.out.println(Algorithm.getMean(v));

        ArrayList<Double> w = new ArrayList<Double>();
        w.add(1.5);
        w.add(1.5);
        w.add(1.5);
        System.out.println(Algorithm.getMean(w));

        ArrayList<Double> x = new ArrayList<Double>();
        x.add(90.0);
        x.add(100.0);
        System.out.println(Algorithm.getMean(x));

        System.out.println();
        
        // reverseArrayList
        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(1);
        y.add(2);
        y.add(3);
        Algorithm.reverseArrayList(y);
        System.out.println(y);
        
        Algorithm.reverseArrayList(y);
        System.out.println(y);

        ArrayList<Integer> z = new ArrayList<Integer>();
        z.add(1);
        Algorithm.reverseArrayList(z);
        System.out.println(z);

        System.out.println();
        
        // containsConsecutiveDuplicate
        ArrayList<Integer> aa = new ArrayList<Integer>();
        aa.add(1);
        aa.add(2);
        aa.add(3);
        aa.add(3);
        aa.add(4);
        System.out.println(Algorithm.containsConsecutiveDuplicate(aa));
        
        ArrayList<Integer> bb = new ArrayList<Integer>();
        bb.add(1);
        bb.add(2);
        bb.add(3);
        System.out.println(Algorithm.containsConsecutiveDuplicate(bb));

        ArrayList<Integer> cc = new ArrayList<Integer>();
        cc.add(1);
        System.out.println(Algorithm.containsConsecutiveDuplicate(cc));

        System.out.println();
        
        // getIndexOfNegative
        ArrayList<Integer> dd = new ArrayList<Integer>();
        dd.add(1);
        dd.add(0);
        dd.add(-1);
        System.out.println(Algorithm.getIndexOfNegative(dd));
        
        ArrayList<Integer> ee = new ArrayList<Integer>();
        ee.add(1);
        ee.add(0);
        System.out.println(Algorithm.getIndexOfNegative(ee));
        
        ArrayList<Integer> ff = new ArrayList<Integer>();
        ff.add(-1);
        ff.add(0);
        ff.add(-1);
        System.out.println(Algorithm.getIndexOfNegative(ff));

        System.out.println();
        
        // containsDuplicate
        ArrayList<Integer> gg = new ArrayList<Integer>();
        gg.add(1);
        gg.add(2);
        gg.add(3);
        gg.add(2);
        System.out.println(Algorithm.containsDuplicate(gg));
        
        ArrayList<Integer> hh = new ArrayList<Integer>();
        hh.add(1);
        hh.add(2);
        hh.add(3);
        System.out.println(Algorithm.containsDuplicate(hh));
        
        ArrayList<Integer> ii = new ArrayList<Integer>();
        ii.add(1);
        System.out.println(Algorithm.containsDuplicate(ii));
    }
}
