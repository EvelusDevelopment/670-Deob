package jagdx;

import java.awt.Component;

public class D3DPRESENT_PARAMETERS {

   public boolean EnableAutoDepthStencil;
   public int SwapEffect = 1;
   public int AutoDepthStencilFormat = 0;
   public int BackBufferHeight = 0;
   public int MultiSampleType = 0;
   public int Flags;
   public int BackBufferWidth = 0;
   public Component DeviceWindow;
   public int PresentationInterval = Integer.MIN_VALUE;
   public int BackBufferFormat = 0;
   public boolean Windowed;
   public int FullScreen_RefreshRateInHz;
   public int MultiSampleQuality = 0;
   public int BackBufferCount = 0;


   public D3DPRESENT_PARAMETERS(Component var1) {
      this.DeviceWindow = var1;
   }
}
