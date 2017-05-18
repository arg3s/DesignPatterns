import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by Konrad on 2017-05-18.
 */
public class GirlControllerTest {

    @Test
    public void testSetAge() {
        GirlView view = mock(GirlView.class);
        GirlModel model = mock(GirlModel.class);
        GirlController controller = new GirlController(model, view);

        verifyZeroInteractions(view, model);
        for (Age a : Age.values()) {
            controller.setAge(a);
            verify(model).setAge(a);
            verifyZeroInteractions(view);
        }
        controller.getAge();
        verify(model).getAge();
        verifyNoMoreInteractions(model, view);
    }

    @Test
    public void testSetHair() {
        GirlView view = mock(GirlView.class);
        GirlModel model = mock(GirlModel.class);
        GirlController controller = new GirlController(model, view);

        verifyZeroInteractions(view, model);
        for (Hair hair : Hair.values()) {
            controller.setHair(hair);
            verify(model).setHair(hair);
            verifyZeroInteractions(view);
        }
        controller.getHair();
        verify(model).getHair();
        verifyNoMoreInteractions(model, view);
    }

    @Test
    public void testSetLook() {
        GirlView view = mock(GirlView.class);
        GirlModel model = mock(GirlModel.class);
        GirlController controller = new GirlController(model, view);

        verifyZeroInteractions(view, model);
        for (Look look : Look.values()) {
            controller.setLook(look);
            verify(model).setLook(look);
            verifyZeroInteractions(view);
        }
        controller.getLook();
        verify(model).getLook();
        verifyNoMoreInteractions(model, view);
    }
    @Test
    public void testUpdateView(){
        GirlView view = mock(GirlView.class);
        GirlModel model = mock(GirlModel.class);
        GirlController controller = new GirlController(model, view);
        verifyZeroInteractions(view, model);

        controller.updateView();
        verify(view).displayView(model);
        verifyNoMoreInteractions(model, view);
    }
}
