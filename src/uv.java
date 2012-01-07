
final class uv {

   static int b;
   static Object[] c = Class_fs.a(1, (byte)-124, new Object[1], 1, 4, 1);
   static int d;
   static int a;


   static final void a(int var0, boolean var1, int var2, int var3, int var4) {
      ++b;
      Object[] var5 = la.a(0, (long)var4, 10);
      jqa.a((byte)111, var5);
      ((int[])((int[])var5[0]))[0] = var3;
      ((int[])((int[])var5[0]))[2] = var2;
      ((int[])((int[])var5[0]))[1] = var0;
      if(!var1) {
         c = new Object[3];
      }

   }

   static final void a(boolean var0, Object[] var1, Object[] var2) {
      try {
         if(!var0) {
            var2[12] = ((Object[])((Object[])((Object[])((Object[])var2[1]))[5]))[7];
         }

         ++d;
         int var3 = ((int[])((int[])var1[1]))[0];
         if(var3 >= 0 && var3 < ((int[])((int[])var2[1]))[0]) {
            --((int[])((int[])var2[1]))[0];
            var2[2] = null;
            if(-1 == ~((int[])((int[])var2[1]))[0]) {
               var2[6] = null;
               var2[0] = null;
               var2[11] = null;
               var2[7] = null;
               ((int[])((int[])var2[1]))[4] = -1;
               ((int[])((int[])var2[1]))[1] = -1;
               var2[13] = null;
            } else {
               qo.a((byte[])((byte[])var2[7]), var3 + 1, (byte[])((byte[])var2[7]), var3, ((int[])((int[])var2[1]))[0] + -var3);
               qo.a((int[])((int[])var2[0]), var3 + 1, (int[])((int[])var2[0]), var3, -var3 + ((int[])((int[])var2[1]))[0]);
               qo.a((int[])((int[])var2[13]), 1 + var3, (int[])((int[])var2[13]), var3, ((int[])((int[])var2[1]))[0] + -var3);
               if(null != var2[6]) {
                  qo.a((long[])((long[])var2[6]), var3 + 1, (long[])((long[])var2[6]), var3, ((int[])((int[])var2[1]))[0] - var3);
               }

               if(null != var2[11]) {
                  qo.a((Object[])((Object[])var2[11]), 1 + var3, (Object[])((Object[])var2[11]), var3, -var3 + ((int[])((int[])var2[1]))[0]);
               }

               if(var3 == ((int[])((int[])var2[1]))[1] || ((int[])((int[])var2[1]))[4] == var3) {
                  aq.a(var2, 25737);
               }
            }

         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var4) {
         throw vt.a(var4, "uv.B(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final Object[] a(Object[] var0, byte var1, int var2, int var3, int var4) {
      ++a;
      if(null == var0[1]) {
         var0[1] = new int[4];
      }

      if(var0[0] == null) {
         var0[0] = new boolean[1];
      }

      ((int[])((int[])var0[1]))[1] = 0;
      ((int[])((int[])var0[1]))[3] = -1;
      var0[2] = ura.a(-120, new Object[2]);
      ((boolean[])((boolean[])var0[0]))[0] = false;
      ((int[])((int[])var0[1]))[0] = var3;
      ((int[])((int[])var0[1]))[2] = var4;
      var0[4] = new Object[((int[])((int[])var0[1]))[2]][];
      if(var1 != 12) {
         return (Object[])null;
      } else {
         var0[3] = new int[((int[])((int[])var0[1]))[0]][3][var2];
         return var0;
      }
   }

}
