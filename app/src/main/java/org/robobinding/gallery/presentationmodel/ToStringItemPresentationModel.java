package org.robobinding.gallery.presentationmodel;

import org.robobinding.itempresentationmodel.ItemContext;
import org.robobinding.itempresentationmodel.ItemPresentationModel;
import org.robobinding.presentationmodel.HasPresentationModelChangeSupport;
import org.robobinding.presentationmodel.PresentationModelChangeSupport;

/**
 * @author Cheng Wei
 * @version $Revision: 1.0 $
 * @since 1.0
 */
public class ToStringItemPresentationModel implements ItemPresentationModel<Object>, HasPresentationModelChangeSupport {
    private final PresentationModelChangeSupport changeSupport;
    private Object item;

    public ToStringItemPresentationModel() {
        changeSupport = new PresentationModelChangeSupport(this);
    }

    @Override
    public void updateData(Object item, ItemContext itemContext) {
        this.item = item;
        changeSupport.refreshPresentationModel();
    }

    public String getValue() {
        return item.toString();
    }

    @Override
    public PresentationModelChangeSupport getPresentationModelChangeSupport() {
        return changeSupport;
    }
}
