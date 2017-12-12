package org.eclipse.gemoc.sample.legacyfsm.fsm;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gemoc.sample.legacyfsm.fsm.FSMMT;

@SuppressWarnings("all")
public class FSM implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static FSM load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    org.eclipse.gemoc.sample.legacyfsm.fsm.FSM mm = new org.eclipse.gemoc.sample.legacyfsm.fsm.FSM();
    mm.setResource(res);
    return mm ;
  }
  
  public FSMMT toFSMMT() {
    org.eclipse.gemoc.sample.legacyfsm.fsm.fsm.adapters.fsmmt.FSMAdapter adaptee = new org.eclipse.gemoc.sample.legacyfsm.fsm.fsm.adapters.fsmmt.FSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
