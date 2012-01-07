import java.nio.ByteBuffer;

final class tq {

   static int b;
   static int c;
   static int d;
   static int e;
   static int a;


   static final void a(boolean var0, boolean var1, boolean var2, Object[] var3) {
      ++a;
      ((boolean[])((boolean[])var3[3]))[2] = var1;
      if(var2) {
         ((boolean[])((boolean[])var3[3]))[1] = var0;
      }
   }

   static final void a(boolean var0, int var1, Object[][] var2) {
      ++c;
      if(var0) {
         for(int var4 = 0; var4 < var2.length; ++var4) {
            Object[] var5 = var2[var4];
            if(var5 != null) {
               Object[] var6;
               if(((int[])((int[])var5[1]))[18] == 0) {
                  if(null != var5[7]) {
                     a(var0, var1, (Object[][])((Object[][])var5[7]));
                  }

                  oh var3;
                  var6 = (var3 = (oh)pm.a((long)((int[])((int[])var5[1]))[3], lfa.c, false)) == null?null:var3.p;
                  if(null != var6) {
                     su.a(var1, ((int[])((int[])var6[1]))[1], false);
                  }
               }

               if(0 == var1 && var5[13] != null) {
                  var6 = nga.b(new Object[7], (byte)87);
                  var6[0] = var5;
                  var6[3] = var5[13];
                  ck.a(var6, true);
               }

               if(var1 == 1 && var5[6] != null) {
                  if(-1 >= ~((int[])((int[])var5[1]))[47]) {
                     var6 = hg.a(((int[])((int[])var5[1]))[3], (byte)-121);
                     if(null == var6 || var6[48] == null || ~((int[])((int[])var5[1]))[47] <= ~((Object[])((Object[])var6[48])).length || ((Object[][])((Object[][])var6[48]))[((int[])((int[])var5[1]))[47]] != var5) {
                        continue;
                     }
                  }

                  var6 = nga.b(new Object[7], (byte)87);
                  var6[0] = var5;
                  var6[3] = var5[6];
                  ck.a(var6, var0);
               }
            }
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
               qf.a(var6, false);
               return var6;
            }
         }

         return null;
      }
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      ++e;
      if(var0[42] != var1 && kea.c && qga.a(((int[])((int[])var0[12]))[21], (byte)127)) {
         wg.b(-24253);
      }

      if(var2 == -1) {
         var0[42] = var1;
         if(null != var0[42]) {
            ((int[])((int[])var0[12]))[45] = ((int[])((int[])((Object[])((Object[])var0[42]))[1]))[24];
            var0[41] = ((Object[])((Object[])var0[42]))[0];
         }

         if(null != var0[16]) {
            ((ch)var0[16]).e();
         }

      }
   }

   static final void a(short var0, int var1, Object[] var2, byte var3, byte var4, byte var5, short var6, ByteBuffer var7, byte var8) {
      ++b;
      var7.putShort(var0);
      var7.putShort(var6);
      var7.put(var8);
      var7.put(var4);
      var7.put(var5);
      var7.put(var3);
      if(var1 > -83) {
         a(((boolean[])((boolean[])var2[3]))[0], true, false, (Object[])null);
      }

   }

   static final int a(int var0, byte var1, int var2, Object[] var3) {
      ++d;
      return var1 <= 55?1:0;
   }

}
