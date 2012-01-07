import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;

final class doa extends Callback {

   private boolean e;
   private int c;
   private volatile int d;
   private volatile boolean b;
   private volatile int a;


   final synchronized int callback(int var1, int var2, int var3, int var4) {
      int var5;
      if(~var1 != ~this.d) {
         var5 = User32.GetWindowLong(var1, -4);
         return User32.CallWindowProc(var5, var1, var2, var3, var4);
      } else {
         if(var2 == 32) {
            var5 = '\uffff' & var4;
            if(1 == var5) {
               User32.SetCursor(!this.b?0:this.c);
               return 0;
            }
         }

         if(var2 == 101024) {
            User32.SetCursor(this.b?this.c:0);
            return 0;
         } else {
            if(var2 == 1) {
               this.d = 0;
               this.b = true;
            }

            return User32.CallWindowProc(this.a, var1, var2, var3, var4);
         }
      }
   }

   final void a(boolean var1, int var2, int var3) {
      if(var1) {
         this.a((Component)null, (byte)82, true);
      }

      User32.SetCursorPos(var2, var3);
   }

   final void a(Component var1, byte var2, boolean var3) {
      WComponentPeer var4 = (WComponentPeer)var1.getPeer();
      int var5 = var4.getTopHwnd();
      if(var5 != this.d || var3 != this.b) {
         if(!this.e) {
            this.c = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.e = true;
         }

         if(this.d != var5) {
            if(this.d != 0) {
               this.b = true;
               User32.SendMessage(var5, 101024, 0, 0);
               synchronized(this) {
                  User32.SetWindowLong(this.d, -4, this.a);
               }
            }

            synchronized(this) {
               this.d = var5;
               this.a = User32.SetWindowLong(this.d, -4, this);
            }
         }

         if(var2 != -17) {
            this.callback(51, 108, -17, 4);
         }

         this.b = var3;
         User32.SendMessage(var5, 101024, 0, 0);
      }
   }

   private doa() throws Throwable {
      throw new Error();
   }
}
