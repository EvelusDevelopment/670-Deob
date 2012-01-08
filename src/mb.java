import jagdx.IDirect3DDevice;

final class mb {

   static int a;
   static int e;
   static Object[] c = sd.a(new Object[1], 6, (byte)119);
   static int b;
   static int f;
   static Object[] d = ed.a(-2, new Object[1], (byte)-119, 5);


   static final void a(Object[] var0, int var1, Object[] var2, int var3) {
      ++e;
      if(var0 != null && -88 == ~var0.length) {
         if(((boolean[])((boolean[])var0[63]))[16]) {
            byte var4;
            if(2 != var3) {
               if(var3 == 1) {
                  var4 = 3;
               } else {
                  var4 = 2;
               }
            } else {
               var4 = 26;
            }

            byte var5 = 0;
            IDirect3DDevice.SetTextureStageState(((long[])((long[])var0[50]))[5], ((int[])((int[])var0[1]))[7], var4, cr.a(var2, (byte)-78) | var5);
         }
      } else {
         if(null == var0 || var0.length != 91) {
            throw new IllegalStateException();
         }

         fo.a(5890, var2, false, var3, false, var0);
      }

      if(var1 != 13195) {
         a((byte)48);
      }

   }

   static final void a(Object[] var0, boolean var1) {
      if(!var1) {
         ++b;
         synchronized(var0[0]) {
            dq.a(-92, (Object[])((Object[])var0[0]));
         }
      }
   }

   static final Object[][] a(byte var0) {
      ++f;
      return var0 != 42?(Object[][])((Object[][])c[8]):new Object[][]{dfa.d, dfa.b, dfa.f, dfa.LOBBYSERVERPACKET, dfa.m, dfa.f_i, dfa.UPDATESERVERPACKET, dfa.o, dfa.LOGINSERVERPACKET, dfa.q, dfa.t, dfa.LOGINRESPONSEPACKET};
   }

   static final Object[] a(Object[] var0, int var1) {
      if(var1 != 6) {
         d = (Object[])((Object[])var0[2]);
      }

      ++a;
      synchronized(var0) {
         ota var3;
         return (var3 = (ota)dda.a((Object[])((Object[])var0[0]), 2)) != null?var3.x:null;
      }
   }

}
