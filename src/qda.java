import jaggl.OpenGL;
import java.util.Hashtable;

final class qda {

   static Hashtable g = new Hashtable(16);
   static int f;
   static int e;
   static int f_i;
   static int b;
   static int h;
   static int a;
   static int c;
   static int d;


   static final void a(byte var0, int var1, Object[] var2, int var3, int var4, int var5) {
      int var6;
      int var7;
      label60: {
         ++h;
         if(null == ((ta)var2[38]).E) {
            var7 = 0;
            var6 = 0;
            if(client.f_vb == 0) {
               break label60;
            }
         }

         var6 = ((ta)var2[38]).E.e();
         var7 = ((ta)var2[38]).E.d();
      }

      var5 = var5 < 0?0:var5;
      var3 = 0 <= var3?var3:0;
      if(var0 > 90) {
         var1 = var6 >= var1?var1:var6;
         var4 = var4 > var7?var7:var4;
         boolean var8 = false;
         if(~var5 < ~((int[])((int[])var2[1]))[16]) {
            var8 = true;
            ((int[])((int[])var2[1]))[16] = var5;
         }

         if(var1 < ((int[])((int[])var2[1]))[2]) {
            ((int[])((int[])var2[1]))[2] = var1;
            var8 = true;
         }

         if(~var3 < ~((int[])((int[])var2[1]))[1]) {
            var8 = true;
            ((int[])((int[])var2[1]))[1] = var3;
         }

         if(((int[])((int[])var2[1]))[26] > var4) {
            var8 = true;
            ((int[])((int[])var2[1]))[26] = var4;
         }

         if(var8) {
            if(!((boolean[])((boolean[])var2[63]))[5]) {
               ((boolean[])((boolean[])var2[63]))[5] = true;
               bt.a(var2, true);
            }

            ima.a(var2, true);
         }

      }
   }

   static final void a(Object[] var0, boolean var1, int var2) {
      ++f_i;
      if(!var1) {
         a(new Object[3], ((int[])((int[])var0[2]))[7]);
      }

      ((int[])((int[])var0[1]))[2] = var2;
      synchronized(var0[4]) {
         dq.a(42, (Object[])((Object[])var0[4]));
      }
   }

   static final void b(Object[] var0, int var1) {
      ++e;
      int var2 = 51 / ((3 - var1) / 32);
      OpenGL.glFinish();
   }

   static final Object[] a(int var0, byte var1, Object[] var2) {
      ++f;
      Object[] var3;
      synchronized(var2[0]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var2[0]), (long)var0));
      }

      if(null != var3) {
         return var3;
      } else {
         byte[] var4;
         Object[] var6;
         synchronized(var2[3]) {
            var6 = (Object[])((Object[])var2[3]);
            int var7 = no.b(0, var0);
            int var8 = var0 & 255;
            var4 = qn.a(var7, var8, var6, -89);
         }

         if(var2 != null && -2 == ~var2.length) {
            qqa.a(var1 ^ 18967, (Object[])null, -120);
         }

         var6 = new Object[8];
         if(null == var6[6]) {
            var6[6] = new boolean[1];
         }

         if(null == var6[3]) {
            var6[3] = new byte[1];
         }

         if(null == var6[1]) {
            var6[1] = new int[9];
         }

         qfa.a(var6, (byte)-80);
         if(var1 != -64) {
            return (Object[])((Object[])var2[1]);
         } else {
            var3 = var6;
            ((int[])((int[])var6[1]))[7] = var0;
            var6[0] = var2;
            if(null != var4) {
               ena.a(1, var6, jta.a((byte)-89, var4, new Object[3]));
            }

            synchronized(var2[0]) {
               il.a((long)var0, var3, true, (Object[])((Object[])var2[0]));
               return var3;
            }
         }
      }
   }

   static final boolean a(int var0, Object[] var1) {
      if(var0 != -16842) {
         g = (Hashtable)null;
      }

      ++d;
      return true;
   }

   static final Object[] a(Object[] var0, int var1) {
      int var2 = -35 / ((var1 + 44) / 50);
      ++c;
      var0[4] = new int[]{-1, -1, -1, -1, -1};
      return var0;
   }

   static final void a(Object[] var0, int var1, ta var2) {
      ++b;
      ya var3 = null;
      if(null == var0[16] && ((boolean[])((boolean[])var0[8]))[6]) {
         Object[] var4 = qra.a(262144, true, var2, var0, -128);
         var3 = (ya)(null != var4?var4[0]:null);
      } else {
         var3 = (ya)var0[16];
         var0[16] = null;
      }

      int var6 = 16 % ((var1 + 37) / 49);
      Object[] var5 = (Object[])((Object[])woa.a(5, var0)[1]);
      if(var3 != null) {
         bi.a(var3, ((byte[])((byte[])var0[10]))[1], (int)((float[])((float[])var5[1]))[2], (int)((float[])((float[])var5[1]))[1], (boolean[])null);
      }

   }

}
