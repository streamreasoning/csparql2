package it.polimi.sr.rsp.csparql.operators;

import it.polimi.deib.sr.rsp.esper.operators.r2s.JDStream;
import it.polimi.deib.sr.rsp.esper.operators.r2s.JIStream;
import it.polimi.deib.sr.rsp.esper.operators.r2s.JRStream;
import org.apache.jena.sparql.engine.binding.Binding;

public class JenaStreamOperators {

    class JenaDStream extends JDStream<Binding> {

        public JenaDStream(int i) {
            super(i);
        }
    }

    class JenaRStream extends JRStream<Binding> {

    }

    class JenaIStream extends JIStream<Binding> {

        public JenaIStream(int i) {
            super(i);
        }
    }

}
