package cmu.edu.kkanal.hw1.cpe;

import java.util.Iterator;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import abner.Tagger;
import cmu.edu.kkanal.hw1.type.GeneAnnotation;
import cmu.edu.kkanal.hw1.type.SentenceAnnotation;

public class AnalysisEngine extends JCasAnnotator_ImplBase {

  /**
   * Inputs a JCAS to the AnalysisComponent. The AnalysisComponent "owns" this JCAS until such time
   * as Annotator_ImplBase.hasNext() is called and returns false. (Source: UIMA Documentation)
   * Responsible for analysis of the text
   * @param JCas  JCas for processing
   * 
   */
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    try {
      FSIndex index = aJCas.getAnnotationIndex(SentenceAnnotation.type);
      Iterator i = index.iterator();
      Tagger t = new Tagger(Tagger.BIOCREATIVE);
      while (i.hasNext()) {

        SentenceAnnotation currentSentence = (SentenceAnnotation) i.next();
        String textToBeAnnotated = currentSentence.getSentence();
        String[] splitText = textToBeAnnotated.split(" ", 2);
        String[] op = t.getEntities(splitText[1], "PROTEIN");
        String temp_sentence = splitText[1].trim().replace(" ", "");
        if (op.length != 0) {
          for (int i1 = 0; i1 < op.length; i1++) {
            GeneAnnotation current_annotation = new GeneAnnotation(aJCas);
            current_annotation.setGeneName(op[i1]);
            op[i1] = op[i1].replace(" ", "");
            int start = temp_sentence.indexOf(op[i1]);
            current_annotation.setSentence_ID(splitText[0]);
            current_annotation.setStart_Index(start);
            current_annotation.setEnd_Index(start + op[i1].length() - 1);
            current_annotation.addToIndexes();
          }
        }

      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
