package rdz.alets.mascotaspractica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityContacto extends AppCompatActivity {
    private Button buttonMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        buttonMail = (Button)findViewById(R.id.btnEnviar);


        buttonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Su mensaje ha sido enviado",Toast.LENGTH_LONG).show();
                //SendMail(view);
            }
        });

    }
}
