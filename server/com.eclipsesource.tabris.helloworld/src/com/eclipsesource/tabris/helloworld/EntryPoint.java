package com.eclipsesource.tabris.helloworld;
import org.eclipse.rap.rwt.lifecycle.IEntryPoint;
import org.eclipse.rap.rwt.widgets.DialogUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class EntryPoint implements IEntryPoint {

  @Override
  public int createUI() {
    Display display = new Display();
    final Shell shell = new Shell( display, SWT.NO_TRIM );
    shell.setMaximized( true );
    shell.setLayout( new GridLayout( 1, false ) );
    Button button = new Button( shell, SWT.PUSH );
    button.setLayoutData( new GridData( SWT.BEGINNING, SWT.CENTER, false, false ) );
    button.setText( "Say Hello" );
    button.addSelectionListener( new SelectionAdapter() {
      @Override
      public void widgetSelected( SelectionEvent e ) {
        MessageBox messageBox = new MessageBox( shell );
        messageBox.setMessage( "Hello World" );
        DialogUtil.open( messageBox, null );
      }
    } );
    shell.open();
    return 0;
  }
}
