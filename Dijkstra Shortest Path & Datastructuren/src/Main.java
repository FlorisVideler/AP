public class Main {
    public static void main(String[] args) {
        //Autorit
        Reis autorit = new Reis();
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

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");

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

        autorit.unsettled.add(a);
        autorit.dijkstra();

        //vlucht
        Reis vlucht = new Reis();
        Node va = new Node("a");
        Node vb = new Node("b");
        Node vc = new Node("c");
        Node vd = new Node("d");
        Node ve = new Node("e");
        Node vf = new Node("f");

        Stap vab = new Vlucht(10, 100, vb);
        Stap vac = new Vlucht(15, 100, vc);

        Stap vbd = new Vlucht(12, 100, vd);
        Stap vbf = new Vlucht(15, 100, vf);

        Stap vce = new Vlucht(10, 100, ve);

        Stap vdf = new Vlucht(1, 100, vf);
        Stap vde = new Vlucht(2, 100, ve);

        Stap vfe = new Vlucht(5, 100, ve);

        va.addEdge(vab);
        va.addEdge(vac);

        vb.addEdge(vbd);
        vb.addEdge(vbf);

        vc.addEdge(vce);

        vd.addEdge(vdf);
        vd.addEdge(vde);

        vf.addEdge(vfe);

        vlucht.unsettled.add(va);
        vlucht.dijkstra();


        Reis trein = new Reis();
        Node ta = new Node("a");
        Node tb = new Node("b");
        Node tc = new Node("c");
        Node td = new Node("d");
        Node te = new Node("e");
        Node tf = new Node("f");

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

        trein.unsettled.add(ta);
        trein.dijkstra();
    }
}
