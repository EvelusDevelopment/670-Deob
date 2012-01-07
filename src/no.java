import jaggl.OpenGL;
import java.awt.Component;
import java.awt.Dimension;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

final class no {

   static Object[] e = Class_fs.a(2, (byte)-93, new Object[1], 0, 10, 2);
   static int f;
   static int h;
   static int g;
   static int c;
   static Object[] b = ed.a(-2, new Object[1], (byte)-125, 102);
   static int f_i;
   static int j;
   static Object[] a = ve.a(new Object[1], (byte)3, 1);
   static Object[] d = ho.a(4, 1, new Object[1], true);
   static int k = 0;


   static final int b(int var0, int var1) {
      ++g;
      if(var0 != 0) {
         a(false, (Object[])((Object[])b[2]));
      }

      return var1 >>> 8;
   }

   static final vp a(int var0, int var1) {
      ++h;
      if(var1 != 0) {
         if(var1 != 1) {
            if(var1 == 2) {
               if(3.0D == (double)eka.h) {
                  return js.b;
               }

               if((double)eka.h == 4.0D) {
                  return cta.p;
               }

               if(6.0D == (double)eka.h) {
                  return eba.f_l;
               }

               if(8.0D <= (double)eka.h) {
                  return cba.b;
               }
            }
         } else {
            if(3.0D == (double)eka.h) {
               return ek.c;
            }

            if((double)eka.h == 4.0D) {
               return nga.f_i;
            }

            if((double)eka.h == 6.0D) {
               return js.b;
            }

            if(8.0D <= (double)eka.h) {
               return cta.p;
            }
         }
      } else {
         if((double)eka.h == 3.0D) {
            return fba.d;
         }

         if((double)eka.h == 4.0D) {
            return tl.a;
         }

         if((double)eka.h == 6.0D) {
            return ek.c;
         }

         if((double)eka.h >= 8.0D) {
            return nga.f_i;
         }
      }

      return var0 != 9059?(vp)null:null;
   }

   static final void b(boolean var0, Object[] var1) {
      ++c;
      if(var0) {
         ((byte[])((byte[])var1[5]))[10] = -75;
      }

      Dimension var2 = ((Component)var1[0]).getSize();
      ((int[])((int[])var1[1]))[1] = var2.width;
      ((int[])((int[])var1[1]))[0] = var2.height;
   }

   static final void a(boolean var0, Object[] var1) {
      ++j;
      if(!var0) {
         a(true, (Object[])null);
      }

      if(null != ((ta)var1[55]).E && ((int[])((int[])var1[1]))[28] < ((int[])((int[])var1[1]))[25] && ((int[])((int[])var1[1]))[10] < ((int[])((int[])var1[1]))[15]) {
         OpenGL.glScissor(((int[])((int[])var1[1]))[5] + ((int[])((int[])var1[1]))[28], ((int[])((int[])var1[1]))[8] + ((ta)var1[55]).E.d() - ((int[])((int[])var1[1]))[15], -((int[])((int[])var1[1]))[28] + ((int[])((int[])var1[1]))[25], ((int[])((int[])var1[1]))[15] + -((int[])((int[])var1[1]))[10]);
      } else {
         OpenGL.glScissor(0, 0, 0, 0);
      }

   }

   static final void a(Object[] var0, int var1) {
      ++f;
      boolean var2 = ((boolean[])((boolean[])var0[63]))[16];
      if(var2) {
         wfa.a(20828, var0);
      }

      ((int[])((int[])var0[1]))[24] = ((int[])((int[])var0[1]))[37];
      if(var1 != 63) {
         e = (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])var0[7]))[2]))[16]);
      }

      ((int[])((int[])var0[1]))[37] = 0;
   }

   static final void a(int var0, Object[] var1) throws LineUnavailableException {
      ((DataLine)var1[9]).flush();
      ++f_i;
      if(var0 != 1) {
         k = -27;
      }

      if(((boolean[])((boolean[])var1[0]))[2]) {
         ((Line)var1[9]).close();
         var1[9] = null;
         Info var2 = new Info(SourceDataLine.class, (AudioFormat)var1[7], ((int[])((int[])var1[1]))[8] << (df.g?2:1));
         var1[9] = AudioSystem.getLine(var2);
         ((Line)var1[9]).open();
         ((DataLine)var1[9]).start();
      }

   }

}
