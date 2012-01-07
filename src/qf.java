
final class qf {

   static Object[] b;
   static int a;


   static final void a(Object[] var0, boolean var1) {
      for(int var2 = ((short[])((short[])var0[13]))[1]; var2 <= ((short[])((short[])var0[13]))[0]; ++var2) {
         for(int var3 = ((short[])((short[])var0[13]))[3]; var3 <= ((short[])((short[])var0[13]))[2]; ++var3) {
            Object[] var4 = ju.g[((byte[])((byte[])var0[10]))[0]][var2][var3];
            if(var4 != null) {
               Object[] var5 = (Object[])((Object[])var4[3]);

               for(Object[] var6 = null; var5 != null; var5 = (Object[])((Object[])var5[0])) {
                  if(var5[1] == var0) {
                     if(var6 != null) {
                        var6[0] = var5[0];
                     } else {
                        var4[3] = var5[0];
                     }

                     if(nf.e < 500) {
                        var5[0] = jca.s;
                        var5[1] = null;
                        ++nf.e;
                        jca.s = var5;
                     }
                     break;
                  }

                  var6 = var5;
               }
            }
         }
      }

      if(!var1) {
         poa.a(var0);
      }

   }

   static final Object[] a(Object[] var0, Object[] var1, long var2, ta var4, ch var5, int var6) {
      ++a;
      if(null == var0[3]) {
         var0[3] = new boolean[2];
      }

      if(null == var0[9]) {
         var0[9] = new long[1];
      }

      if(var0[1] == null) {
         var0[1] = new int[9];
      }

      ((boolean[])((boolean[])var0[3]))[1] = false;
      ((int[])((int[])var0[1]))[0] = 0;
      var0[0] = ca.a((byte)100, new Object[1]);
      var0[7] = ca.a((byte)67, new Object[1]);
      ((boolean[])((boolean[])var0[3]))[0] = false;
      tta var8 = new tta(var0);
      var0[2] = var1;
      ((long[])((long[])var0[9]))[0] = var2;
      var0[8] = var8;
      var0[4] = var5;
      if(var0 != null && var0.length == 4 && var0[1].equals(Boolean.valueOf(false)) && var0[1].equals(Integer.valueOf(0))) {
         ke.a((byte)62, (Object[])null);
      }

      Object[] var11 = (Object[])((Object[])var0[2]);
      Object[] var10 = os.a(((int[])((int[])var11[1]))[1], (byte)120);
      var0[6] = var10;
      if(!var4.o() && 0 != ~((int[])((int[])((Object[])((Object[])var0[6]))[1]))[5]) {
         var0[6] = os.a(((int[])((int[])((Object[])((Object[])var0[6]))[1]))[5], (byte)121);
      }

      var0[5] = aqa.a(new Object[2], 113);
      ((int[])((int[])var0[1]))[0] = (int)((double)((int[])((int[])var0[1]))[0] + 64.0D * Math.random());
      ke.a((byte)62, var0);
      ((int[])((int[])((Object[])((Object[])var0[7]))[0]))[8] = ((int[])((int[])((Object[])((Object[])var0[0]))[0]))[8];
      ((int[])((int[])((Object[])((Object[])var0[7]))[0]))[10] = ((int[])((int[])((Object[])((Object[])var0[0]))[0]))[10];
      ((int[])((int[])((Object[])((Object[])var0[7]))[0]))[11] = ((int[])((int[])((Object[])((Object[])var0[0]))[0]))[11];
      ((int[])((int[])((Object[])((Object[])var0[7]))[0]))[2] = ((int[])((int[])((Object[])((Object[])var0[0]))[0]))[2];
      ((int[])((int[])((Object[])((Object[])var0[7]))[0]))[5] = ((int[])((int[])((Object[])((Object[])var0[0]))[0]))[5];
      ((int[])((int[])((Object[])((Object[])var0[7]))[0]))[6] = ((int[])((int[])((Object[])((Object[])var0[0]))[0]))[6];
      ((int[])((int[])((Object[])((Object[])var0[7]))[0]))[7] = ((int[])((int[])((Object[])((Object[])var0[0]))[0]))[7];
      ((int[])((int[])((Object[])((Object[])var0[7]))[0]))[3] = ((int[])((int[])((Object[])((Object[])var0[0]))[0]))[3];
      ((int[])((int[])((Object[])((Object[])var0[7]))[0]))[9] = ((int[])((int[])((Object[])((Object[])var0[0]))[0]))[var6];
      return var0;
   }

}
