import jagdx.D3DDISPLAYMODE;
import jagdx.IDirect3D;
import jagdx.fna;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class InputStreamWorker implements Runnable {

   static int d;
   static int e;
   private Object[] wrapper;
   static int a;
   static int f;
   static int c = -1;
   static int b;


   static final int a(int var0, int var1, int var2, int var3) {
      if(var1 < 35) {
         a(58, (ta)null, (Object[])null);
      }

      ++b;
      if(var3 == var0) {
         return var3;
      } else {
         int var4 = 128 + -var2;
         int var5 = var4 * (127 & var3) + (var0 & 127) * var2 >> 7;
         int var6 = (896 & var3) * var4 + (var0 & 896) * var2 >> 7;
         int var7 = var2 * (var0 & '\ufc00') + ('\ufc00' & var3) * var4 >> 7;
         return var7 & '\ufc00' | 896 & var6 | var5 & 127;
      }
   }

   static final boolean a(Object[] var0, Object[] var1, Object[] var2, int var3) {
      ++f;
      if(var3 != -27840) {
         a((Object[])((Object[])var0[2]), (Object[])null, (Object[])null, ((int[])((int[])var2[2]))[1]);
      }

      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      return fna.a(IDirect3D.GetAdapterDisplayMode(((long[])((long[])var1[50]))[6], ((int[])((int[])var1[1]))[41], var4), (byte)85) && fna.a(IDirect3D.CheckDeviceFormat(((long[])((long[])var1[50]))[6], ((int[])((int[])var1[1]))[41], ((int[])((int[])var1[1]))[39], var4.Format, 0, 4, wg.a((byte)19, var0, var2)), (byte)116);
   }

   public final void run() {
      ++d;
      if(wrapper != null && wrapper.length == 4) {
         this.run();
      }

      while(true) {
         int length;
         synchronized(null == wrapper?null:wrapper[2]) {
            if(wrapper != null && wrapper.length == 3) {
               ((long[])((long[])this.wrapper[1]))[2] = -84L;
            }

            while(true) {
               if(wrapper[3] != null) {
                  return;
               }

               if(((int[])((int[])wrapper[1]))[1] != 0) {
                  if(~((int[])((int[])wrapper[1]))[1] < ~((int[])((int[])wrapper[1]))[2]) {
                     length = -1 - ((int[])((int[])wrapper[1]))[2] + ((int[])((int[])wrapper[1]))[1];
                  } else {
                     length = ((int[])((int[])wrapper[1]))[0] - ((int[])((int[])wrapper[1]))[2];
                  }
               } else {
                  length = ((int[])((int[])wrapper[1]))[0] + (-((int[])((int[])wrapper[1]))[2] - 1);
               }

               if(0 < length) {
                  break;
               }

               try {
                  wrapper[2].wait();
               } catch (InterruptedException var13) {
                  ;
               }
            }
         }

         int read;
         try {
            read = ((InputStream)wrapper[0]).read((byte[])((byte[])wrapper[5]), ((int[])((int[])wrapper[1]))[2], length);
            if(read == -1) {
               throw new EOFException();
            }
         } catch (IOException ex) {
            IOException ioex = ex;
            synchronized(null == wrapper?null:wrapper[2]) {
               wrapper[3] = ioex;
               return;
            }
         }

         synchronized(null == wrapper? null : wrapper[2]) {
            ((int[])((int[])wrapper[1]))[2] = (read + ((int[])((int[])wrapper[1]))[2]) % ((int[])((int[])wrapper[1]))[0];
         }
      }
   }

   static final Object[] a(int var0, int var1, int var2, ut var3) {
      Object[] var4 = ju.g[var0][var1][var2];
      if(var4 == null) {
         return null;
      } else {
         for(Object[] var5 = (Object[])((Object[])var4[3]); var5 != null; var5 = (Object[])((Object[])var5[0])) {
            Object[] var6 = (Object[])((Object[])var5[1]);
            if((var3 == null || var3.a(var6)) && ((short[])((short[])var6[13]))[1] == var1 && ((short[])((short[])var6[13]))[3] == var2) {
               return var6;
            }
         }

         return null;
      }
   }

   InputStreamWorker(Object[] wrapper) {
      this.wrapper = wrapper;
   }

   static final Object[] a(Object[] var0, byte var1, Object[] var2) {
      eta.c(var0, -111);
      ++a;
      var0[2] = var2;
      ((int[])((int[])var0[1]))[0] = 0;
      return var1 >= -89?(Object[])((Object[])((Object[])((Object[])var0[0]))[19]):var0;
   }

   static final Object[] a(int var0, ta var1, Object[] var2) {
      if(var0 != 0) {
         c = 110;
      }

      ++e;
      Object[] var3 = (Object[])((Object[])woa.a(5, var2)[1]);
      if(null == var2[15]) {
         var2[15] = lv.a((int)((float[])((float[])var3[1]))[1], (int)((float[])((float[])var3[1]))[0], (int)((float[])((float[])var3[1]))[2], 0, ar.a(true, 0, var2, var1));
      }

      return (Object[])((Object[])var2[15]);
   }

}
