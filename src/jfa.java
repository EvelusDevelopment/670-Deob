
final class jfa {

   static int b;
   static int d;
   static int f;
   static int c;
   static Object[] e = ed.a(-1, new Object[1], (byte)-110, 93);
   static int a;


   static final int a(boolean var0, int var1, Object[] var2, int var3) {
      ++d;
      if(var2[3] == null) {
         return var3;
      } else {
         ma var4;
         Object[] var5 = null != (var4 = (ma)pm.a((long)var1, (Object[])((Object[])var2[3]), var0))?var4.s:null;
         return var5 != null?((int[])((int[])var5[1]))[0]:var3;
      }
   }

   static final int a(byte var0, Object[] var1) {
      int var2 = -127 / ((var0 + 50) / 55);
      ++c;
      return ((int[])((int[])var1[1]))[1];
   }

   static final void a(Object[] var0, int var1) {
      ++f;

      while(!((boolean[])((boolean[])var0[2]))[0]) {
         Object[] var5;
         synchronized(var0[3]) {
            rw var2;
            var5 = null == (var2 = (rw)hia.b((byte)127, (Object[])((Object[])var0[3])))?null:var2.y;
            if(var5 == null) {
               try {
                  var0[3].wait();
               } catch (InterruptedException var10) {
                  ;
               }
               continue;
            }

            --((int[])((int[])var0[1]))[0];
         }

         try {
            if(((int[])((int[])var5[4]))[0] != 2) {
               if(((int[])((int[])var5[4]))[0] == 3) {
                  var5[5] = rc.a((Object[])((Object[])var5[2]), (int)((tha)(var5 == null?null:var5[1])).m, 124);
               }
            } else {
               ot.a(false, ((byte[])((byte[])var5[5])).length, (byte[])((byte[])var5[5]), (int)((tha)(var5 == null?null:var5[1])).m, (Object[])((Object[])var5[2]));
            }
         } catch (Exception var9) {
            taa.a(var9, 32, (String)null);
         }

         ((boolean[])((boolean[])var5[0]))[0] = false;
      }

      if(var1 != -31733) {
         e = (Object[])null;
      }

   }

   static final Object[] a(float var0, int var1, int var2, int var3, int var4, Object[] var5, float var6, byte var7, float var8, int var9) {
      ++b;
      if(null == var5[1]) {
         var5[1] = new int[13];
      }

      bi.a(var5, var2, var1, var3, var4, var9, 0);
      ((int[])((int[])var5[1]))[7] = (int)(var8 * 4096.0F);
      ((int[])((int[])var5[1]))[12] = (int)(var0 * 4096.0F);
      ((int[])((int[])var5[1]))[5] = ((int[])((int[])var5[1]))[9] = (int)(Math.pow(0.5D, (double)(-var6)) * 4096.0D);
      if(var7 != -52) {
         a((Object[])((Object[])e[0]), ((int[])((int[])var5[15]))[1]);
      }

      return var5;
   }

}
