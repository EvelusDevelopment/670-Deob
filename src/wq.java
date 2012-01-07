
final class wq {

   static int a;
   static Object[] b = sd.a(new Object[1], 88, (byte)115);
   static int c;
   static int e;
   static int d = -1;


   static final void a(Object[] var0, int var1) {
      if(var1 <= 29) {
         d = 10;
      }

      ++c;
      if(null == var0[3]) {
         var0[3] = new long[1];
      }

      if(null == var0[1]) {
         var0[1] = new int[2];
      }

   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, int var3, int var4, byte var5, int var6, Object[] var7, int var8, int var9) {
      ++a;
      if(null == var7[0]) {
         var7[0] = new boolean[1];
      }

      if(null == var7[1]) {
         var7[1] = new int[4];
      }

      ((int[])((int[])var7[1]))[3] = -1;
      ((boolean[])((boolean[])var7[0]))[0] = true;
      if(var7 != null && var7.length == 12) {
         a((Object[])null, (Object[])null, (Object[])null, 1, 112, (byte)54, -97, (Object[])null, 19, -84);
      }

      ((int[])((int[])var7[1]))[0] = var6;
      var7[5] = var0;
      var7[4] = var1;
      ((int[])((int[])var7[1]))[1] = var3;
      int var13 = 1 << var4;
      int var14 = 0;
      int var15 = var8 << var4;
      int var16 = 66 / ((-66 - var5) / 43);
      int var17 = var9 << var4;

      int var19;
      int var20;
      for(int var18 = 0; var13 > var18; ++var18) {
         var19 = var15 + ((aa)(var2 != null?var2[6]:null)).f_i * (var18 + var17);
         if(null != var7 && (var7.length == 11 && var7[2].equals(Integer.valueOf(2)) && var7[2].equals(Integer.valueOf(2)) || -25 == ~var7.length || var7.length == 16)) {
            return null;
         }

         for(var20 = 0; var13 > var20; ++var20) {
            short[] var21 = ((short[][])((short[][])var2[7]))[var19++];
            if(var21 != null) {
               var14 += var21.length;
            }
         }
      }

      ((int[])((int[])var7[1]))[2] = var14;
      if(0 < var14) {
         Object[] var25 = hi.newByteBufferWrapper(2 * var14);
         int var23;
         short[] var22;
         int var26;
         if(((boolean[])((boolean[])((Object[])((Object[])var7[5]))[17]))[11]) {
            if(null != var2 && (var2.length == 21 && var2[15].equals(Boolean.valueOf(false)) || -3 == ~var2.length && var2[0].equals(Integer.valueOf(1)))) {
               return null;
            }

            for(var19 = 0; var13 > var19; ++var19) {
               if(var0 != null && (var0.length == 9 || var0.length == 1)) {
                  return null;
               }

               var20 = var15 + (var17 + var19) * ((aa)(var2 == null?null:var2[6])).f_i;

               for(var26 = 0; var13 > var26; ++var26) {
                  var22 = ((short[][])((short[][])var2[7]))[var20++];
                  if(var22 != null) {
                     for(var23 = 0; ~var23 > ~var22.length; ++var23) {
                        eda.a((byte)100, var25, var22[var23] & '\uffff');
                     }

                     if(var2 != null && (var2.length == 7 || 23 == var2.length && var2[4].equals(Boolean.valueOf(false)))) {
                        return null;
                     }
                  }
               }
            }
         } else {
            if(null != var25 && 29 == var25.length) {
               a((Object[])null, new Object[1][], (Object[])null, -35, 66, (byte)43, 43, (Object[])null, 1, -35);
            }

            for(var19 = 0; var13 > var19; ++var19) {
               var20 = var15 + ((aa)(null != var2?var2[6]:null)).f_i * (var19 + var17);
               if(var0 != null && 5 == var0.length) {
                  return null;
               }

               for(var26 = 0; var26 < var13; ++var26) {
                  var22 = ((short[][])((short[][])var2[7]))[var20++];
                  if(null != var22) {
                     if(var7 != null && (var7.length == 16 && var7[8].equals(Boolean.valueOf(false)) && var7[8].equals(Integer.valueOf(1)) || var7.length == 5 && var7[0].equals(Integer.valueOf(0)) || 3 == var7.length)) {
                        a((Object[])null, (Object[])null, (Object[])null, -114, 85, (byte)54, -116, (Object[])null, 102, 116);
                     }

                     for(var23 = 0; ~var23 > ~var22.length; ++var23) {
                        nua.a(var25, 1, '\uffff' & var22[var23]);
                     }
                  }
               }
            }
         }

         var7[6] = bqa.a((byte[])((byte[])var25[2]), 3, (Object[])((Object[])var7[5]), 5123, ((int[])((int[])var25[1]))[0], false);
         var7[2] = hha.a((Object[])((Object[])var7[5]), 5123, new Object[1], (byte[])null, 1, 35);
      } else {
         var7[3] = null;
      }

      return var7;
   }

}
