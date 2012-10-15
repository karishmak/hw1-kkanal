package cmu.edu.kkanal.hw1.cpe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Iterator;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceProcessException;

import abner.Tagger;

import cmu.edu.kkanal.hw1.type.GeneAnnotation;

public class CasConsumer extends CasConsumer_ImplBase {

  /**
   * @param
   */
  @Override
  public void processCas(CAS arg0) throws ResourceProcessException {
    // TODO Auto-generated method stub
    JCas jcas;
    String result = "";
    try {
      jcas = arg0.getJCas();
    } catch (CASException e) {
      throw new ResourceProcessException(e);
    }
    try {
      FSIndex index = jcas.getAnnotationIndex(GeneAnnotation.type);
      Iterator i = index.iterator();
      while (i.hasNext()) {
        GeneAnnotation currentGeneAnnotation = (GeneAnnotation) i.next();
        result = result + currentGeneAnnotation.getSentence_ID() + " |"
                + currentGeneAnnotation.getStart_Index() + " "
                + currentGeneAnnotation.getEnd_Index() + "| " + currentGeneAnnotation.getGeneName()
                + "\n";
      }

      FileWriter fstream = new FileWriter((String)getConfigParameterValue("output_file_path"));
      BufferedWriter out = new BufferedWriter(fstream);
      out.write(result);
      out.close();

    } catch (Exception e) {// Catch exception if any
      System.err.println("Error: " + e.getMessage());
    }
  }

}
