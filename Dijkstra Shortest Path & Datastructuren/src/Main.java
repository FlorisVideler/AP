import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Autorit
//
//        Node a = new Node("a");
//        Node b = new Node("b");
//        Node c = new Node("c");
//        Node d = new Node("d");
//
//        Stap ab = new Rit(10, b);
//        Stap ac = new Rit(1, c);
//        Stap bd = new Rit(1, d);
//        Stap cd = new Rit(4, d);
//
//        Stap cb = new Rit(1, b);
//
//        a.addEdge(ab);
//        a.addEdge(ac);
//        b.addEdge(bd);
//        c.addEdge(cd);
//        c.addEdge(cb);

        Dijkstra dijkstra = new Dijkstra();

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

        ArrayList<Node> map = new ArrayList<>();
        map.add(a);
        map.add(b);
        map.add(c);
        map.add(d);
        map.add(e);
        map.add(f);

        Stap ab = new Rit(10, b);
        Stap ac = new Rit(15, c);

        Stap bd = new Rit(12, d);
        Stap bf = new Rit(15, f);

        Stap ce = new Rit(10, e);

        Stap df = new Rit(1, f);
        Stap de = new Rit(2, e);

        Stap fe = new Rit(5, e);

        a.addEdge(ab);
        a.addEdge(ac);

        b.addEdge(bd);
        b.addEdge(bf);

        c.addEdge(ce);

        d.addEdge(df);
        d.addEdge(de);

        f.addEdge(fe);

        Reis autoRit = dijkstra.bestPath(map);
        System.out.println(autoRit.toString());

        //vlucht
        Node va = new Node("a");
        Node vb = new Node("b");
        Node vc = new Node("c");
        Node vd = new Node("d");
        Node ve = new Node("e");
        Node vf = new Node("f");

        ArrayList<Node> vluchtMap = new ArrayList<>();
        vluchtMap.add(va);
        vluchtMap.add(vb);
        vluchtMap.add(vc);
        vluchtMap.add(vd);
        vluchtMap.add(ve);
        vluchtMap.add(vf);

        Stap vab = new Vlucht(10, 10, vb);
        Stap vac = new Vlucht(15, 0, vc);

        Stap vbd = new Vlucht(12, 30, vd);
        Stap vbf = new Vlucht(15, 23, vf);

        Stap vce = new Vlucht(100, 3, ve);

        Stap vdf = new Vlucht(1, 44, vf);
        Stap vde = new Vlucht(2, 58, ve);

        Stap vfe = new Vlucht(5, 12, ve);

        va.addEdge(vab);
        va.addEdge(vac);

        vb.addEdge(vbd);
        vb.addEdge(vbf);

        vc.addEdge(vce);

        vd.addEdge(vdf);
        vd.addEdge(vde);

        vf.addEdge(vfe);

        Reis vlucht = dijkstra.bestPath(vluchtMap);
        System.out.println(vlucht.toString());

        Node ta = new Node("a");
        Node tb = new Node("b");
        Node tc = new Node("c");
        Node td = new Node("d");
        Node te = new Node("e");
        Node tf = new Node("f");

        ArrayList<Node> spoorMap = new ArrayList<>();
        spoorMap.add(ta);
        spoorMap.add(tb);
        spoorMap.add(tc);
        spoorMap.add(td);
        spoorMap.add(te);
        spoorMap.add(tf);

        Stap tab = new Treinrit(10, tb);
        Stap tac = new Treinrit(15, tc);

        Stap tbd = new Treinrit(12, td);
        Stap tbf = new Treinrit(15, tf);

        Stap tce = new Treinrit(10, te);

        Stap tdf = new Treinrit(1, tf);
        Stap tde = new Treinrit(2, te);

        Stap tfe = new Treinrit(5, te);

        ta.addEdge(tab);
        ta.addEdge(tac);

        tb.addEdge(tbd);
        tb.addEdge(tbf);

        tc.addEdge(tce);

        td.addEdge(tdf);
        td.addEdge(tde);

        tf.addEdge(tfe);

        Reis treinRit = dijkstra.bestPath(spoorMap);
        System.out.println(treinRit.toString());
    }
}
